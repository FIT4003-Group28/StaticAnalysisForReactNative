package defpackage;

import android.view.View;
import android.widget.ImageButton;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: xht  reason: default package */
/* loaded from: classes4.dex */
public final class xht implements View.OnClickListener {
    public xhs a;
    private final ImageButton b;
    private xef c;
    private final aafo d;

    public xht(ImageButton imageButton, aafo aafoVar) {
        imageButton.getClass();
        this.b = imageButton;
        this.d = aafoVar;
        imageButton.setOnClickListener(this);
        c();
    }

    public final void a(xef xefVar) {
        this.c = xefVar;
        c();
    }

    public final void b(boolean z) {
        xef xefVar = this.c;
        if (xefVar == null) {
            return;
        }
        xefVar.b = z;
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() {
        /*
            r5 = this;
            xef r0 = r5.c
            r1 = 0
            if (r0 == 0) goto L5c
            boolean r2 = r0.b
            if (r2 == 0) goto Lc
            arhs r0 = r0.d
            goto Le
        Lc:
            arhs r0 = r0.c
        Le:
            if (r0 != 0) goto L12
        L10:
            r0 = 0
            goto L3b
        L12:
            java.util.EnumMap r2 = defpackage.xef.a
            int r3 = r0.c
            arhr r3 = defpackage.arhr.b(r3)
            if (r3 != 0) goto L1e
            arhr r3 = defpackage.arhr.UNKNOWN
        L1e:
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L25
            goto L10
        L25:
            java.util.EnumMap r2 = defpackage.xef.a
            int r0 = r0.c
            arhr r0 = defpackage.arhr.b(r0)
            if (r0 != 0) goto L31
            arhr r0 = defpackage.arhr.UNKNOWN
        L31:
            java.lang.Object r0 = r2.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L3b:
            if (r0 == 0) goto L42
            android.widget.ImageButton r2 = r5.b
            r2.setImageResource(r0)
        L42:
            android.widget.ImageButton r2 = r5.b
            xef r3 = r5.c
            boolean r3 = r3.b
            r2.setSelected(r3)
            android.widget.ImageButton r2 = r5.b
            xef r3 = r5.c
            boolean r4 = r3.b
            if (r4 == 0) goto L56
            java.lang.CharSequence r3 = r3.h
            goto L58
        L56:
            java.lang.CharSequence r3 = r3.g
        L58:
            r2.setContentDescription(r3)
            goto L5d
        L5c:
            r0 = 0
        L5d:
            android.widget.ImageButton r2 = r5.b
            if (r0 == 0) goto L62
            r1 = 1
        L62:
            defpackage.zag.o(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xht.c():void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xef xefVar = this.c;
        if (xefVar == null) {
            return;
        }
        apzg apzgVar = xefVar.b ? xefVar.f : xefVar.e;
        if (apzgVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
        this.d.c(apzgVar, hashMap);
        xef xefVar2 = this.c;
        xefVar2.b = !xefVar2.b;
        c();
        xhs xhsVar = this.a;
        if (xhsVar == null) {
            return;
        }
        xhsVar.a();
    }
}
