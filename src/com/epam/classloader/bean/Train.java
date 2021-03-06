package com.epam.classloader.bean;

import com.epam.classloader.Interface.ITransport;

/**
 * Created by Yury Zaranok (yury_zaranok@epam.com) on 01.10.14.
 */
public class Train implements ITransport {
    @Override
    public String getTransportType() {
        return "Train";
    }

    @Override
    public int getPassengerCount() {
        return 500;
    }
}
