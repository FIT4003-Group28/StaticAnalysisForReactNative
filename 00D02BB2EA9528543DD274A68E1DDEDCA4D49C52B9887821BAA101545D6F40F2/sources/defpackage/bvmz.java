package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bvmz  reason: default package */
/* loaded from: classes4.dex */
public class bvmz implements bvmy {
    private final Context a;
    private final btvo b;
    private final dxio<afha> c;
    private final String d;
    private final boolean e = true;

    public bvmz(Context context, btvo btvoVar, dxio<afha> dxioVar, String str, boolean z) {
        this.a = context;
        this.b = btvoVar;
        this.c = dxioVar;
        this.d = str;
    }

    @Override // defpackage.bvmy
    public String a() {
        return this.d;
    }

    @Override // defpackage.bvmy
    public cqkl b() {
        this.c.a().k(this.a, this.b.getUserToUserBlockingParameters().a, 1);
        return cqkl.a;
    }

    @Override // defpackage.bvmy
    public Boolean c() {
        return true;
    }
}
