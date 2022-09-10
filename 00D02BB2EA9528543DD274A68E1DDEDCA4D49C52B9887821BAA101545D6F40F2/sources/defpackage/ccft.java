package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccft  reason: default package */
/* loaded from: classes.dex */
public final class ccft extends afhx {
    public static final dbsl<afga> a = ccfs.a;
    private final gfq b;
    private final dxio<cdfx> c;
    private final dxio<cfrt> d;
    private final dxio<chnm> e;

    public ccft(Intent intent, @dzsi String str, gfq gfqVar, dxio<cdfx> dxioVar, dxio<cfrt> dxioVar2, dxio<chnm> dxioVar3) {
        super(intent, str, afid.TODO_PHOTO);
        this.b = gfqVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
    }

    @Override // defpackage.afhx
    public final void a() {
        if (!affw.b(this.f)) {
            this.b.c();
        }
        if (this.e.a().n()) {
            if (this.d.a().b()) {
                this.d.a().a();
            }
            dwyd b = dwyd.b(this.f.getIntExtra("upload_entry_point", dwyd.UNKNOWN_ENTRY_POINT.Z));
            drrt bZ = drry.d.bZ();
            bZ.a(drrx.PHOTO);
            this.e.a().j(bZ.bK(), this.f.getByteArrayExtra("ctok_key"), dpyv.TODO_PHOTO, b);
            return;
        }
        this.c.a().i(this.f);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_TODO_PHOTO;
    }
}
