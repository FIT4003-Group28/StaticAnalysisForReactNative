package defpackage;
/* compiled from: PG */
/* renamed from: low  reason: default package */
/* loaded from: classes3.dex */
public final class low implements ajzh {
    static final String a = String.valueOf(low.class.getName()).concat(".PRESENT_CONTEXT_KEY");
    public final boolean b;
    public ajrt c;
    public Object d;
    public boolean e;
    private final aafd f;
    private lou g;

    public low(aafd aafdVar, akam akamVar) {
        aqxo.p(akamVar instanceof lov);
        this.f = aafdVar;
        lov lovVar = (lov) akamVar;
        this.d = lovVar.a;
        this.b = lovVar.b;
    }

    public low(aafd aafdVar, boolean z) {
        this.f = aafdVar;
        this.b = z;
    }

    public static ampq a(ajrs ajrsVar) {
        ajrsVar.getClass();
        Object c = ajrsVar.c(a);
        return c instanceof low ? ampq.j((low) c) : amon.a;
    }

    public final void b(lou louVar, Object obj) {
        obj.getClass();
        lou louVar2 = this.g;
        if (louVar2 != null) {
            louVar2.c(false);
        }
        if (this.e) {
            louVar.c(true);
        }
        this.g = louVar;
        this.d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r0.qn(com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass.downloadsPageEndpoint) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
        if ("FEhistory".equals(((defpackage.apnv) r0.qm(com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint)).c) != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.lou r7, java.lang.Object r8) {
        /*
            r6 = this;
            r7.getClass()
            r8.getClass()
            java.lang.Object r0 = r6.d
            r1 = 4
            if (r0 == 0) goto L67
            java.lang.Class r2 = r8.getClass()
            java.lang.Class r3 = r0.getClass()
            if (r2 == r3) goto L16
            goto L66
        L16:
            boolean r2 = r8 instanceof defpackage.aqdr
            if (r2 == 0) goto L3c
            aafd r2 = r6.f
            r3 = r8
            aqdr r3 = (defpackage.aqdr) r3
            int r4 = r3.e
            if (r4 != r1) goto L28
            java.lang.Object r3 = r3.f
            apzg r3 = (defpackage.apzg) r3
            goto L2a
        L28:
            apzg r3 = defpackage.apzg.a
        L2a:
            aqdr r0 = (defpackage.aqdr) r0
            int r4 = r0.e
            if (r4 != r1) goto L35
            java.lang.Object r0 = r0.f
            apzg r0 = (defpackage.apzg) r0
            goto L37
        L35:
            apzg r0 = defpackage.apzg.a
        L37:
            boolean r0 = r2.a(r3, r0)
            goto L61
        L3c:
            boolean r2 = r8 instanceof defpackage.aqdv
            if (r2 == 0) goto L66
            aafd r2 = r6.f
            r3 = r8
            aqdv r3 = (defpackage.aqdv) r3
            int r4 = r3.c
            if (r4 != r1) goto L4e
            java.lang.Object r3 = r3.d
            apzg r3 = (defpackage.apzg) r3
            goto L50
        L4e:
            apzg r3 = defpackage.apzg.a
        L50:
            aqdv r0 = (defpackage.aqdv) r0
            int r4 = r0.c
            if (r4 != r1) goto L5b
            java.lang.Object r0 = r0.d
            apzg r0 = (defpackage.apzg) r0
            goto L5d
        L5b:
            apzg r0 = defpackage.apzg.a
        L5d:
            boolean r0 = r2.a(r3, r0)
        L61:
            if (r0 == 0) goto L66
            r6.b(r7, r8)
        L66:
            return
        L67:
            boolean r0 = r6.b
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L88
            boolean r0 = r8 instanceof defpackage.aqdv
            if (r0 == 0) goto Lc0
            r0 = r8
            aqdv r0 = (defpackage.aqdv) r0
            int r4 = r0.c
            if (r4 != r1) goto L7d
            java.lang.Object r0 = r0.d
            apzg r0 = (defpackage.apzg) r0
            goto L7f
        L7d:
            apzg r0 = defpackage.apzg.a
        L7f:
            aopg r1 = com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass.downloadsPageEndpoint
            boolean r0 = r0.qn(r1)
            if (r0 == 0) goto Lc0
            goto Lc1
        L88:
            boolean r0 = r8 instanceof defpackage.aqdr
            if (r0 == 0) goto Lc0
            r0 = r8
            aqdr r0 = (defpackage.aqdr) r0
            int r4 = r0.e
            if (r4 != r1) goto L98
            java.lang.Object r4 = r0.f
            apzg r4 = (defpackage.apzg) r4
            goto L9a
        L98:
            apzg r4 = defpackage.apzg.a
        L9a:
            aopg r5 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint
            boolean r4 = r4.qn(r5)
            if (r4 == 0) goto Lc0
            int r4 = r0.e
            if (r4 != r1) goto Lab
            java.lang.Object r0 = r0.f
            apzg r0 = (defpackage.apzg) r0
            goto Lad
        Lab:
            apzg r0 = defpackage.apzg.a
        Lad:
            aopg r1 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint
            java.lang.Object r0 = r0.qm(r1)
            apnv r0 = (defpackage.apnv) r0
            java.lang.String r0 = r0.c
            java.lang.String r1 = "FEhistory"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc0
            goto Lc1
        Lc0:
            r2 = 0
        Lc1:
            if (r2 == 0) goto Lc6
            r6.b(r7, r8)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.low.c(lou, java.lang.Object):void");
    }

    public final void d(lou louVar) {
        louVar.getClass();
        if (louVar.equals(this.g)) {
            this.g = null;
        }
    }

    @Override // defpackage.ajzh
    public final akam pn() {
        throw null;
    }
}
