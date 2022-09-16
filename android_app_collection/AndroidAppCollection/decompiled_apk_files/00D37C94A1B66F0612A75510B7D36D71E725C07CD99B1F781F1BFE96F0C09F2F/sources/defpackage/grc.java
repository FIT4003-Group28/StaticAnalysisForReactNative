package defpackage;

import android.graphics.Rect;
import android.widget.SeekBar;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: grc  reason: default package */
/* loaded from: classes3.dex */
public final class grc extends amh {
    final /* synthetic */ gre f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grc(gre greVar) {
        super(greVar);
        this.f = greVar;
    }

    @Override // defpackage.amh
    protected final int k(float f, float f2) {
        if (this.f.s.contains(f, f2)) {
            return 0;
        }
        if (this.f.t.contains(f, f2)) {
            return 1;
        }
        return this.f.u.contains(f, f2) ? 2 : -1;
    }

    @Override // defpackage.amh
    protected final void m(List list) {
        list.add(0);
        list.add(2);
        list.add(1);
    }

    @Override // defpackage.amh
    protected final void q(int i, mh mhVar) {
        String str;
        Rect rect = new Rect();
        if (i == 0) {
            gre greVar = this.f;
            str = greVar.n;
            greVar.s.round(rect);
        } else if (i == 1) {
            gre greVar2 = this.f;
            str = greVar2.o;
            greVar2.t.round(rect);
        } else if (i == 2) {
            gre greVar3 = this.f;
            str = greVar3.m;
            greVar3.u.round(rect);
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("invalid virtual view id: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        mhVar.v(str);
        mhVar.r(SeekBar.class.getName());
        mhVar.n(rect);
        mhVar.h(4096);
        mhVar.h(8192);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amh
    public final boolean u(int i, int i2) {
        grb grbVar;
        if (i == 0) {
            grbVar = new grb(this, 1);
        } else if (i == 1) {
            grbVar = new grb(this);
        } else if (i == 2) {
            grbVar = new grb(this, 2);
        } else {
            StringBuilder sb = new StringBuilder(35);
            sb.append("invalid virtual view id:");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 == 4096 || i2 == 8192) {
            float f = this.f.l;
            if (i2 == 8192) {
                f = -f;
            }
            grbVar.a(Float.valueOf(f));
            grd grdVar = this.f.p;
            if (grdVar != null) {
                grdVar.a();
            }
            o(i, 0);
            v(i, 4);
            return true;
        }
        return false;
    }
}
