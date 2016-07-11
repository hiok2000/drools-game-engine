/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.game.core;

import java.util.LinkedList;
import java.util.Queue;
import org.drools.game.core.api.Command;
import org.drools.game.core.api.GameCallbackService;

public class GameCallbackServiceImpl implements GameCallbackService {

    private Queue<Command> callbacksQueue = new LinkedList<Command>();

    @Override
    public void addCallback( Command cmd ) {
        callbacksQueue.add( cmd );
    }

    @Override
    public Queue<Command> getCallbacks() {
        return callbacksQueue;
    }

}