package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.io.File;
/* compiled from: PG */
/* renamed from: alec  reason: default package */
/* loaded from: classes.dex */
public final class alec extends alfw {
    public static final /* synthetic */ int c = 0;
    private static final Duration e = Duration.ofSeconds(2);
    private static final Duration f = Duration.ofSeconds(1);
    final Duration a;
    final Duration b;
    private final Context g;
    private final snc h;
    private final aadd i;
    private final albq k;
    private final alhn l;
    private final alak m;
    private final albf n;

    public alec(Context context, snc sncVar, aadd aaddVar, albq albqVar, alhn alhnVar, akze akzeVar, alak alakVar, albf albfVar, alez alezVar, aldn aldnVar, alht alhtVar) {
        super(avuo.UPLOAD_PROCESSOR_TYPE_COPY_FILE, sncVar, aaddVar, akzeVar, albfVar, alezVar, aldnVar, alhtVar);
        this.a = e;
        this.b = f;
        this.g = context;
        this.h = sncVar;
        this.i = aaddVar;
        this.k = albqVar;
        this.l = alhnVar;
        this.m = alakVar;
        this.n = albfVar;
    }

    private static void s(File file, long j) {
        if (file.getFreeSpace() >= j) {
            return;
        }
        throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INSUFFICIENT_SPACE_TO_START);
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.k;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.y;
        return alctVar == null ? alct.a : alctVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0243  */
    @Override // defpackage.aleo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt c(java.lang.String r43, defpackage.akzp r44, defpackage.alcw r45) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alec.c(java.lang.String, akzp, alcw):ankt");
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.k;
    }

    @Override // defpackage.algt
    public final String f() {
        return "CopyFileTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        int i = alcwVar.b;
        return ((i & 2) == 0 || (i & 64) == 0) ? false : true;
    }
}
