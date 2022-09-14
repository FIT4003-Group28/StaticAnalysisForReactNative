package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5467a = false;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f5467a = false;
        }
    }

    public boolean a(int i, View view) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.f5467a) {
                this.f5467a = false;
                return true;
            }
            this.f5467a = true;
            new Handler().postDelayed(new a(), 200L);
        }
        return false;
    }
}
