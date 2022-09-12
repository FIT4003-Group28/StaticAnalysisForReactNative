package defpackage;

import android.content.Intent;
import android.util.Base64;
/* compiled from: PG */
/* renamed from: ccgd  reason: default package */
/* loaded from: classes.dex */
public final class ccgd extends afhx {
    public static final dbsl<afga> a = ccgc.a;
    private final dxio<cezv> b;

    public ccgd(Intent intent, @dzsi String str, dxio<cezv> dxioVar) {
        super(intent, str, afid.UGC_POST_TRIP_QUESTIONS);
        this.b = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        try {
            byte[] byteArrayExtra = this.f.getByteArrayExtra("questions");
            if (byteArrayExtra == null && this.f.getStringExtra("questions") != null) {
                byteArrayExtra = Base64.decode(this.f.getStringExtra("questions"), 0);
            }
            dlno dlnoVar = (dlno) dsqw.cq(dlno.f, byteArrayExtra);
            this.b.a().f(dlnoVar, cedo.g(dlnoVar.b));
        } catch (dsrm | IllegalArgumentException | NullPointerException unused) {
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_UGC_POST_TRIP_QUESTIONS_NOTIFICATION;
    }
}
