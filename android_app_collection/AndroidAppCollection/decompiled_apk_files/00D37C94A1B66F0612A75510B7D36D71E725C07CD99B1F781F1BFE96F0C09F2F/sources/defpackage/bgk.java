package defpackage;

import android.content.ComponentName;
import android.content.Context;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: bgk  reason: default package */
/* loaded from: classes2.dex */
public class bgk {
    public final Context e;
    public final bgi f;
    public final bgh g;
    public bgc h;
    public bgb i;
    public boolean j;
    public bgm k;
    public boolean l;

    public bgk(Context context) {
        this(context, null);
    }

    public bgj b(String str) {
        throw null;
    }

    public void d(bgb bgbVar) {
    }

    public bgg jI(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public final void jK(bgc bgcVar) {
        bhd.c();
        this.h = bgcVar;
    }

    public final void jL(bgm bgmVar) {
        bhd.c();
        if (this.k != bgmVar) {
            this.k = bgmVar;
            if (this.l) {
                return;
            }
            this.l = true;
            this.g.sendEmptyMessage(1);
        }
    }

    public final void jM(bgb bgbVar) {
        bhd.c();
        if (Objects.equals(this.i, bgbVar)) {
            return;
        }
        jN(bgbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void jN(bgb bgbVar) {
        this.i = bgbVar;
        if (!this.j) {
            this.j = true;
            this.g.sendEmptyMessage(2);
        }
    }

    public bgk(Context context, bgi bgiVar) {
        this.g = new bgh(this);
        if (context != null) {
            this.e = context;
            if (bgiVar == null) {
                this.f = new bgi(new ComponentName(context, getClass()));
                return;
            } else {
                this.f = bgiVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public bgj jJ(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new IllegalArgumentException("routeGroupId cannot be null");
            }
            return b(str);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
}
