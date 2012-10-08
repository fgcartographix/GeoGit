/* Copyright (c) 2011 TOPP - www.openplans.org. All rights reserved.
 * This code is licensed under the LGPL 2.1 license, available at the root
 * application directory.
 */

package org.geogit.pg.cli;

import org.geogit.cli.CLIModule;

import com.google.inject.Binder;

/**
 *
 */
public class PGModule implements CLIModule {

    @Override
    public void configure(Binder binder) {
        binder.bind(PGCommandProxy.class);
    }

}
