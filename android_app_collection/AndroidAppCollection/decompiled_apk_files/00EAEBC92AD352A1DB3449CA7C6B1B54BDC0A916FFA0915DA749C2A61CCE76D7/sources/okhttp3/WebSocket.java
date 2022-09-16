package okhttp3;

import h.f;
/* loaded from: classes.dex */
public interface WebSocket {

    /* loaded from: classes.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(f fVar);

    boolean send(String str);
}
