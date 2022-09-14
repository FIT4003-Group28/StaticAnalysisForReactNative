package defpackage;

import android.content.Intent;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bfwx  reason: default package */
/* loaded from: classes.dex */
public final class bfwx extends afhx {
    private final dxio<afzv> c;
    private static final dcqe b = dcqe.c("bfwx");
    public static final dbsl<afga> a = bfwv.a;

    public bfwx(dxio<afzv> dxioVar, Intent intent, @dzsi String str) {
        super(intent, str, afid.LOCAL_STREAM_CONTINUATION_ACTION);
        this.c = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        Serializable serializable = this.f.getExtras().getBundle("LocalStream_b").getSerializable("LocalStream_d");
        if (serializable instanceof bfww) {
            this.c.a().r(((bfww) serializable).a);
        } else {
            bvoo.h("Unexpected data: %s", serializable);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }
}
