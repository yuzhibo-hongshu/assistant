package com.hs.assistant.service;

import android.content.Intent;
import android.net.Network;
import android.net.VpnService;
import android.os.IBinder;
import java.net.DatagramSocket;
import java.net.Socket;

/**
 * Created by hongshu on 2017/8/6.
 */

public class ADVPNService extends VpnService {

    @Override
    public boolean protect(int socket) {
        return super.protect(socket);
    }

    @Override
    public boolean protect(Socket socket) {
        return super.protect(socket);
    }

    @Override
    public boolean protect(DatagramSocket socket) {
        return super.protect(socket);
    }

    @Override
    public boolean setUnderlyingNetworks(Network[] networks) {
        return super.setUnderlyingNetworks(networks);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override
    public void onRevoke() {
        super.onRevoke();
    }
}
