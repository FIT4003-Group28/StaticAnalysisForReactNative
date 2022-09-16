package defpackage;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: waj  reason: default package */
/* loaded from: classes4.dex */
public final class waj {
    public static final waj a = new waj();
    public final String b;
    public final arag c;
    public final Spanned d;
    public final aalc e;
    public final aalc f;

    private waj() {
        this.b = "";
        this.c = null;
        this.d = new SpannableStringBuilder();
        this.e = null;
        this.f = null;
    }

    private static avhn a(aalc aalcVar) {
        if (aalcVar != null) {
            return aalcVar.e();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof waj)) {
            return false;
        }
        waj wajVar = (waj) obj;
        return akzj.f(this.b, wajVar.b) && akzj.f(this.c, wajVar.c) && akzj.f(this.d, wajVar.d) && akzj.f(a(this.e), a(wajVar.e)) && akzj.f(a(this.f), a(wajVar.f));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, a(this.e), a(this.f)});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("accountEmail", this.b);
        c.b("accountNameProto", this.c);
        c.b("accountName", this.d);
        c.b("accountPhotoThumbnails", a(this.e));
        c.b("mobileBannerThumbnails", a(this.f));
        return c.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public waj(java.lang.String r6, defpackage.aarw r7) {
        /*
            r5 = this;
            aowy r0 = r7.a
            arag r0 = r0.d
            if (r0 != 0) goto L8
            arag r0 = defpackage.arag.a
        L8:
            aalc r1 = r7.c()
            aalc r2 = r7.b
            if (r2 != 0) goto L26
            aowy r2 = r7.a
            int r3 = r2.b
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L26
            aalc r3 = new aalc
            avhn r2 = r2.l
            if (r2 != 0) goto L21
            avhn r2 = defpackage.avhn.a
        L21:
            r3.<init>(r2)
            r7.b = r3
        L26:
            aalc r7 = r7.b
            r5.<init>(r6, r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.waj.<init>(java.lang.String, aarw):void");
    }

    public waj(String str, arag aragVar, aalc aalcVar, aalc aalcVar2) {
        zgh.m(str);
        this.b = str;
        aragVar.getClass();
        this.c = aragVar;
        this.d = ajgl.b(aragVar);
        this.e = aalcVar;
        this.f = aalcVar2;
    }

    public waj(String str, String str2, Uri uri) {
        this.b = str2;
        this.c = null;
        this.d = !TextUtils.isEmpty(str) ? new SpannableStringBuilder(str) : null;
        this.e = uri != null ? new aalc(uri) : null;
        this.f = null;
    }

    public waj(String str, String str2, avhn avhnVar) {
        this.b = str;
        this.d = new SpannableStringBuilder(str2);
        aopc aopcVar = (aopc) arag.a.createBuilder();
        aopcVar.copyOnWrite();
        arag aragVar = (arag) aopcVar.instance;
        str2.getClass();
        aragVar.b |= 1;
        aragVar.d = str2;
        this.c = (arag) aopcVar.mo39build();
        this.e = new aalc(avhnVar);
        this.f = null;
    }
}
