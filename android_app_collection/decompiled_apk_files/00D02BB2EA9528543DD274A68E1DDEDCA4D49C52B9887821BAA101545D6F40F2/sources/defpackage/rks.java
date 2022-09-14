package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rks  reason: default package */
/* loaded from: classes7.dex */
public final class rks {
    public final Activity a;
    public final dxio<qjk> b;
    public final dxio<bvjj> c;
    public final dxio<cqat> d;
    private final btvo e;

    public rks(Activity activity, btvo btvoVar, dxio<qjk> dxioVar, dxio<bvjj> dxioVar2, dxio<cqat> dxioVar3) {
        this.a = activity;
        this.e = btvoVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
    }

    public final dktt a() {
        dktt dkttVar = this.e.getPassiveAssistParameters().a().am;
        return dkttVar == null ? dktt.z : dkttVar;
    }
}
