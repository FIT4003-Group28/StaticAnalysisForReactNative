package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: akmn  reason: default package */
/* loaded from: classes.dex */
public final class akmn extends afhx {
    private final ckcw c;
    private final dxio<aagc> d;
    private static final dcqe b = dcqe.c("akmn");
    public static final dbsl<afga> a = akmm.a;

    public akmn(Intent intent, @dzsi String str, ckcw ckcwVar, dxio<aagc> dxioVar) {
        super(intent, str, afid.EVENT_NOTIFICATION);
        this.d = dxioVar;
        this.c = ckcwVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        dlfj dlfjVar;
        if (this.f.hasExtra("payload")) {
            try {
                dlfjVar = (dlfj) dsqw.cq(dlfj.g, this.f.getByteArrayExtra("payload"));
            } catch (dsrm unused) {
                bvoo.h("Invalid payload in the intent.", new Object[0]);
                dlfjVar = null;
            }
            if (dlfjVar == null) {
                return;
            }
            ((ckco) this.c.a(ckht.S)).a(dlfjVar.e);
            if ((dlfjVar.a & 4096) == 0) {
                bvoo.h("The payload in the intent is missing the mid.", new Object[0]);
            } else {
                this.d.a().a(dlfjVar.d, 2);
            }
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_EVENT_NOTIFICATION;
    }
}
