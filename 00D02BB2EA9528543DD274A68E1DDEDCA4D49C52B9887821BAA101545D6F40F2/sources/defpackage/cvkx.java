package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.EnumSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cvkx  reason: default package */
/* loaded from: classes5.dex */
public final class cvkx implements cvkt {
    private static final Set<cviv> a = EnumSet.of(cviv.REGISTERED, cviv.PENDING_REGISTRATION, cviv.FAILED_REGISTRATION);
    private final cvla b;
    private final cvmf c;
    private final cvoe d;
    private final cvkf e;
    private final cvot f;
    private final cvln g;
    private final cvtq h;
    private final cvlr i;

    public cvkx(cvla cvlaVar, cvmf cvmfVar, cvoe cvoeVar, cvlr cvlrVar, cvtq cvtqVar, cvkf cvkfVar, cvot cvotVar, cvln cvlnVar) {
        this.b = cvlaVar;
        this.c = cvmfVar;
        this.d = cvoeVar;
        this.i = cvlrVar;
        this.h = cvtqVar;
        this.e = cvkfVar;
        this.f = cvotVar;
        this.g = cvlnVar;
    }

    @Override // defpackage.cvkt
    public final boolean a(Intent intent) {
        if (intent == null || !"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        Object[] objArr = new Object[2];
        objArr[0] = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb = new StringBuilder();
        sb.append("Extras: [\n");
        if (extras != null) {
            for (String str : extras.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(extras.get(str));
                sb.append("\n");
            }
        }
        sb.append("]");
        objArr[1] = sb.toString();
        cvlw.a("GcmIntentHandler", "onReceive: %s \n %s", objArr);
        cvkw cvkwVar = (cvkw) cvkz.f(intent);
        int i = cvkwVar.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        return (i2 == 0 || i2 == 1) ? !TextUtils.isEmpty(cvkwVar.a) : i2 == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d1, code lost:
        if (android.text.TextUtils.isEmpty(r5.c) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ef, code lost:
        if (r5 == 5) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f7, code lost:
        if (android.text.TextUtils.isEmpty(r2.b) == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    @Override // defpackage.cvkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Intent r19, defpackage.cvix r20, long r21) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvkx.b(android.content.Intent, cvix, long):void");
    }
}
