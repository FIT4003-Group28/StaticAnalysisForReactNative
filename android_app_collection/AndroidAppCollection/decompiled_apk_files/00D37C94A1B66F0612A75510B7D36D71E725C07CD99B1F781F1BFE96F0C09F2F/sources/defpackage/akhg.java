package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: akhg  reason: default package */
/* loaded from: classes.dex */
public final class akhg implements akhh {
    public acvg a;
    private final byte[] b;
    private aogk c;
    private final String d;
    private akvm e;

    public akhg(byte[] bArr, String str) {
        this.b = bArr;
        new HashMap();
        this.d = str;
    }

    public akhg(byte[] bArr, String str, byte[] bArr2) {
        this.b = bArr;
        this.d = str;
    }

    @Override // defpackage.akgm
    public final void a(akvm akvmVar) {
        this.e = akvmVar;
    }

    @Override // defpackage.akhh
    public final int b() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    @Override // defpackage.akhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.akhe d() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhg.d():akhe");
    }

    @Override // defpackage.akhh
    public final String e() {
        return this.d;
    }

    @Override // defpackage.akhh
    public final byte[] f() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr;
        }
        aogk aogkVar = this.c;
        if (aogkVar == null) {
            return null;
        }
        return aogkVar.toByteArray();
    }

    @Override // defpackage.akgr
    public final void j(acvg acvgVar) {
        this.a = acvgVar;
    }

    @Override // defpackage.akgr
    public final acvg oj() {
        return this.a;
    }
}
