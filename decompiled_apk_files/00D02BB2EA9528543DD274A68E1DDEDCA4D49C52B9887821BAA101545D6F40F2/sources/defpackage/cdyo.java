package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdyo  reason: default package */
/* loaded from: classes4.dex */
public final class cdyo extends tj<cdyl, cdyp> {
    public static final /* synthetic */ int i = 0;
    private static final cdvj n = new cdvj(2131232685, R.string.UNIFIED_PHOTO_UPLOAD_FLOW_GALLERY_PICK_PHOTOS, cdvi.MEDIA_PICK, dtyd.O);
    private static final cdvj o = new cdvj(2131232837, R.string.UNIFIED_PHOTO_UPLOAD_FLOW_GALLERY_TAKE_PHOTOS, cdvi.MEDIA_CAPTURE, dtyd.N);
    public List<? extends Uri> e;
    public List<? extends Uri> f;
    public final dzve<Uri, dztc> g;
    public final dzve<Uri, dztc> h;
    private final List<cdvj> j;
    private final cebd k;
    private final ilo l;
    private final dzve<cdvi, dztc> m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cdyo(Activity activity, cebd cebdVar, ilo iloVar, dzve<? super cdvi, dztc> dzveVar, dzve<? super Uri, dztc> dzveVar2, dzve<? super Uri, dztc> dzveVar3) {
        super(new cdym());
        List<cdvj> a;
        dzvx.c(cebdVar, "logger");
        this.k = cebdVar;
        this.l = iloVar;
        this.m = dzveVar;
        this.g = dzveVar2;
        this.h = dzveVar3;
        this.e = dztu.a;
        this.f = dztu.a;
        if (activity.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            a = dztd.a(new cdvj[]{o, n});
        } else {
            a = dzti.a(n);
        }
        this.j = a;
        a(a);
    }

    @Override // defpackage.abg
    /* renamed from: A */
    public final void f(cdyp cdypVar, int i2, List<Object> list) {
        dzvx.c(cdypVar, "holder");
        dzvx.c(list, "changes");
        cdyl b = b(i2);
        dzvx.b(b, "getItem(position)");
        cdyl cdylVar = b;
        dzvx.c(list, "$this$firstOrNull");
        cdypVar.C(cdylVar, list.isEmpty() ? null : list.get(0));
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ acl d(ViewGroup viewGroup, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("Unknown view type".toString());
            }
            return new cdut(viewGroup, this.m, this.k);
        }
        return new cdyv(viewGroup, new cdyn(this), this.k, this.l);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(acl aclVar, int i2) {
        cdyp cdypVar = (cdyp) aclVar;
        dzvx.c(cdypVar, "holder");
        f(cdypVar, i2, new ArrayList());
    }

    @Override // defpackage.abg
    public final int i(int i2) {
        cdyl b = b(i2);
        if (b instanceof cdvk) {
            return 0;
        }
        if (!(b instanceof cdvj)) {
            throw new dzsw();
        }
        return 1;
    }

    public final void y(List<? extends Uri> list) {
        dzvx.c(list, "value");
        this.f = dzti.h(list);
        a(z());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[LOOP:0: B:30:0x0080->B:32:0x0086, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.cdyl> z() {
        /*
            r8 = this;
            java.util.List<cdvj> r0 = r8.j
            java.util.List<? extends android.net.Uri> r1 = r8.f
            java.util.List<? extends android.net.Uri> r2 = r8.e
            java.lang.String r3 = "$this$minus"
            defpackage.dzvx.c(r2, r3)
            java.lang.String r3 = "elements"
            defpackage.dzvx.c(r1, r3)
            java.lang.String r3 = "$this$convertToSetForSetOperationWith"
            defpackage.dzvx.c(r1, r3)
            java.lang.String r3 = "source"
            defpackage.dzvx.c(r2, r3)
            boolean r3 = r1 instanceof java.util.Set
            if (r3 == 0) goto L1f
            goto L3e
        L1f:
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L40
            boolean r3 = r2 instanceof java.util.Collection
            r4 = 2
            if (r3 == 0) goto L2f
            int r3 = r2.size()
            if (r3 >= r4) goto L2f
            goto L3e
        L2f:
            int r3 = r1.size()
            if (r3 <= r4) goto L3e
            boolean r3 = r1 instanceof java.util.ArrayList
            if (r3 == 0) goto L3e
            java.util.HashSet r3 = defpackage.dzti.e(r1)
            goto L44
        L3e:
            r3 = r1
            goto L44
        L40:
            java.util.HashSet r3 = defpackage.dzti.e(r1)
        L44:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L4f
            java.util.List r3 = defpackage.dzti.f(r2)
            goto L6d
        L4f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L58:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r5.next()
            boolean r7 = r3.contains(r6)
            if (r7 != 0) goto L58
            r4.add(r6)
            goto L58
        L6c:
            r3 = r4
        L6d:
            java.util.List r1 = defpackage.dzti.i(r3, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.dzti.d(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L80:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto La7
            java.lang.Object r4 = r1.next()
            android.net.Uri r4 = (android.net.Uri) r4
            cdvk r5 = new cdvk
            r5.<init>(r4)
            int r4 = r2.indexOf(r4)
            android.net.Uri r5 = r5.b
            java.lang.String r6 = "uri"
            defpackage.dzvx.c(r5, r6)
            cdvk r6 = new cdvk
            r6.<init>(r5)
            r6.a = r4
            r3.add(r6)
            goto L80
        La7:
            java.util.List r0 = defpackage.dzti.i(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdyo.z():java.util.List");
    }
}
