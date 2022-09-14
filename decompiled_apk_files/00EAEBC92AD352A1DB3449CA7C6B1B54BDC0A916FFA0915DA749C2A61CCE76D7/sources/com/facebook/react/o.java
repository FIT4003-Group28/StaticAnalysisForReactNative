package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.f;
import java.util.Map;
/* loaded from: classes.dex */
public class o {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Integer, String> f5811c;

    /* renamed from: a  reason: collision with root package name */
    private int f5812a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final y f5813b;

    static {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a(23, "select");
        a2.a(66, "select");
        a2.a(62, "select");
        a2.a(85, "playPause");
        a2.a(89, "rewind");
        a2.a(90, "fastForward");
        a2.a(19, "up");
        a2.a(22, "right");
        a2.a(20, "down");
        a2.a(21, "left");
        f5811c = a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(y yVar) {
        this.f5813b = yVar;
    }

    private void a(String str, int i) {
        a(str, i, -1);
    }

    private void a(String str, int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i2);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.f5813b.a("onHWKeyEvent", writableNativeMap);
    }

    public void a() {
        int i = this.f5812a;
        if (i != -1) {
            a("blur", i);
        }
        this.f5812a = -1;
    }

    public void a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if ((action == 1 || action == 0) && f5811c.containsKey(Integer.valueOf(keyCode))) {
            a(f5811c.get(Integer.valueOf(keyCode)), this.f5812a, action);
        }
    }

    public void a(View view) {
        if (this.f5812a == view.getId()) {
            return;
        }
        int i = this.f5812a;
        if (i != -1) {
            a("blur", i);
        }
        this.f5812a = view.getId();
        a("focus", view.getId());
    }
}
