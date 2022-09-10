package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: pep  reason: default package */
/* loaded from: classes.dex */
final class pep {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private dqvj e;
    private boolean f;
    private int g;
    private boolean h;
    private final String i;
    private final boolean j;

    public pep(String str, boolean z) {
        this.i = str;
        this.j = z;
    }

    private final boolean j() {
        return this.a && !this.b;
    }

    public final synchronized boolean a() {
        boolean j;
        j = j();
        this.a = true;
        return !j;
    }

    public final synchronized boolean b() {
        boolean j;
        j = j();
        this.a = false;
        return j;
    }

    public final synchronized boolean c() {
        boolean j;
        j = j();
        this.b = true;
        return j;
    }

    public final synchronized boolean d() {
        boolean j;
        j = j();
        this.b = false;
        return !j;
    }

    public final synchronized boolean e(boolean z, boolean z2, dqvj dqvjVar) {
        if (this.j) {
            return false;
        }
        if (this.c == z && this.d == z2 && this.e == dqvjVar) {
            return false;
        }
        this.c = z;
        this.d = z2;
        this.e = dqvjVar;
        return true;
    }

    public final synchronized boolean f(int i) {
        boolean z;
        if (this.g != i) {
            this.g = i;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized boolean g(boolean z) {
        boolean z2;
        if (this.f != z) {
            this.f = z;
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final synchronized boolean h(boolean z) {
        boolean z2;
        if (this.h != z) {
            this.h = z;
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final synchronized Intent i(String str) {
        Intent putExtra;
        putExtra = new Intent("com.google.android.apps.gmm.NAVIGATION_STATE").setPackage(str).putExtra("fg", j()).putExtra("nav", this.c).putExtra("freenav", this.d).putExtra("loudness_gain_db", this.g).putExtra("use_device_speakers", this.f).putExtra("prompted_action_type", 0).putExtra("hw", this.h).putExtra("use_assistant", !this.j).putExtra("android.intent.extra.REFERRER", this.i);
        dqvj dqvjVar = this.e;
        if (dqvjVar != null) {
            putExtra.putExtra("mode", afhi.i(dqvjVar));
        }
        return putExtra;
    }

    public final synchronized String toString() {
        dbsb b;
        b = dbsc.b(this);
        b.h("isAppStarted", this.a);
        b.h("isAppInPip", this.b);
        b.h("isNavigating", this.c);
        b.h("isFreeNav", this.d);
        b.b("travelMode", this.e);
        b.h("useDeviceSpeakers", this.f);
        b.f("loudnessGainDb", this.g);
        b.f("promptedActionType", 0);
        b.h("hotwordConstraintsMet", this.h);
        b.h("useAssistant", !this.j);
        b.b("Intent.EXTRA_REFERRER", this.i);
        b.c();
        return b.toString();
    }
}
