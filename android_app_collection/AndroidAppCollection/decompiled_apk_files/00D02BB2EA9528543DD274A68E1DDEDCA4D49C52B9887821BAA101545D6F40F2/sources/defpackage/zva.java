package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: zva  reason: default package */
/* loaded from: classes7.dex */
public final class zva extends cqtd {
    private final bvnx a;
    private final vxz b;

    public zva(bvnx bvnxVar, vxz vxzVar) {
        super(new Object[]{vxzVar});
        this.a = bvnxVar;
        this.b = vxzVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        cqss u;
        zuy zuyVar = new zuy(this.a, context.getResources());
        if (this.b == vxz.CHANGED) {
            u = irg.y();
        } else {
            u = irg.u();
        }
        zuyVar.setColorFilter(new PorterDuffColorFilter(u.b(context), PorterDuff.Mode.SRC_IN));
        return zuyVar;
    }
}
