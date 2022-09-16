package androidx.window.layout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
@azrk(b = "androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1", c = "WindowInfoRepositoryImpl.kt", d = "invokeSuspend", e = {84, 85})
/* loaded from: classes.dex */
public final class WindowInfoRepositoryImpl$configurationChanged$1 extends azrn implements azsg {
    final /* synthetic */ azrr $producer;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$configurationChanged$1(WindowInfoRepositoryImpl windowInfoRepositoryImpl, azrr azrrVar, azqy azqyVar) {
        super(2, azqyVar);
        this.this$0 = windowInfoRepositoryImpl;
        this.$producer = azrrVar;
    }

    @Override // defpackage.azrg
    public final azqy create(Object obj, azqy azqyVar) {
        WindowInfoRepositoryImpl$configurationChanged$1 windowInfoRepositoryImpl$configurationChanged$1 = new WindowInfoRepositoryImpl$configurationChanged$1(this.this$0, this.$producer, azqyVar);
        windowInfoRepositoryImpl$configurationChanged$1.L$0 = obj;
        return windowInfoRepositoryImpl$configurationChanged$1;
    }

    @Override // defpackage.azsg
    public final Object invoke(azxf azxfVar, azqy azqyVar) {
        return ((WindowInfoRepositoryImpl$configurationChanged$1) create(azxfVar, azqyVar)).invokeSuspend(azqm.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #1 {all -> 0x009d, blocks: (B:20:0x0063, B:23:0x0074, B:25:0x007c), top: B:42:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:42:0x0063). Please submit an issue!!! */
    @Override // defpackage.azrg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            azrf r0 = defpackage.azrf.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            java.lang.Object r1 = r8.L$2
            azwv r1 = (defpackage.azwv) r1
            java.lang.Object r4 = r8.L$1
            androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1$configChangeObserver$1 r4 = (androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1$configChangeObserver$1) r4
            java.lang.Object r5 = r8.L$0
            azxf r5 = (defpackage.azxf) r5
            defpackage.azqj.q(r9)     // Catch: java.lang.Throwable -> L1d
            r9 = r5
            goto L62
        L1d:
            r9 = move-exception
            goto La2
        L20:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L28:
            java.lang.Object r1 = r8.L$2
            azwv r1 = (defpackage.azwv) r1
            java.lang.Object r4 = r8.L$1
            androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1$configChangeObserver$1 r4 = (androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1$configChangeObserver$1) r4
            java.lang.Object r5 = r8.L$0
            azxf r5 = (defpackage.azxf) r5
            defpackage.azqj.q(r9)     // Catch: java.lang.Throwable -> L1d
            r6 = r5
            r5 = r8
            goto L74
        L3a:
            defpackage.azqj.q(r9)
            java.lang.Object r9 = r8.L$0
            azxf r9 = (defpackage.azxf) r9
            azwu r1 = defpackage.azww.a()
            androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1$publish$1 r4 = new androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1$publish$1
            azrr r5 = r8.$producer
            r4.<init>(r1, r5)
            androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1$configChangeObserver$1 r5 = new androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1$configChangeObserver$1
            r5.<init>()
            r4.mo26invoke()
            androidx.window.layout.WindowInfoRepositoryImpl r4 = r8.this$0
            android.app.Activity r4 = androidx.window.layout.WindowInfoRepositoryImpl.access$getActivity$p(r4)
            r4.registerComponentCallbacks(r5)
            azwv r1 = r1.b()     // Catch: java.lang.Throwable -> La0
            r4 = r5
        L62:
            r5 = r8
        L63:
            r5.L$0 = r9     // Catch: java.lang.Throwable -> L9d
            r5.L$1 = r4     // Catch: java.lang.Throwable -> L9d
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L9d
            r5.label = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L9d
            if (r6 == r0) goto L9f
            r7 = r6
            r6 = r9
            r9 = r7
        L74:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9d
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto L91
            java.lang.Object r9 = r1.b()     // Catch: java.lang.Throwable -> L9d
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L9d
            r5.L$1 = r4     // Catch: java.lang.Throwable -> L9d
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L9d
            r5.label = r2     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r9 = r6.emit(r9, r5)     // Catch: java.lang.Throwable -> L9d
            if (r9 == r0) goto L90
            r9 = r6
            goto L63
        L90:
            return r0
        L91:
            androidx.window.layout.WindowInfoRepositoryImpl r9 = r5.this$0
            android.app.Activity r9 = androidx.window.layout.WindowInfoRepositoryImpl.access$getActivity$p(r9)
            r9.unregisterComponentCallbacks(r4)
            azqm r9 = defpackage.azqm.a
            return r9
        L9d:
            r9 = move-exception
            goto La3
        L9f:
            return r0
        La0:
            r9 = move-exception
            r4 = r5
        La2:
            r5 = r8
        La3:
            androidx.window.layout.WindowInfoRepositoryImpl r0 = r5.this$0
            android.app.Activity r0 = androidx.window.layout.WindowInfoRepositoryImpl.access$getActivity$p(r0)
            r0.unregisterComponentCallbacks(r4)
            goto Lae
        Lad:
            throw r9
        Lae:
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoRepositoryImpl$configurationChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
