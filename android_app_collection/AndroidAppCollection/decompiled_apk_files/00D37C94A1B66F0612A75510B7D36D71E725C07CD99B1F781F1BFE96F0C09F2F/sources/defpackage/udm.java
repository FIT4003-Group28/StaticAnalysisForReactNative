package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: udm  reason: default package */
/* loaded from: classes4.dex */
public final class udm implements udj {
    private static final Set a = EnumSet.of(ubx.REGISTERED, ubx.PENDING_REGISTRATION, ubx.FAILED_REGISTRATION);
    private final udo b;
    private final ufe c;
    private final ucs d;
    private final uen e;
    private final uhh f;
    private final axnm g;
    private final snc h;
    private final ugx i;
    private final uiy j;
    private final ues k;

    public udm(udo udoVar, ufe ufeVar, ugx ugxVar, ues uesVar, uiy uiyVar, ucs ucsVar, uen uenVar, uhh uhhVar, axnm axnmVar, snc sncVar) {
        this.b = udoVar;
        this.c = ufeVar;
        this.i = ugxVar;
        this.k = uesVar;
        this.j = uiyVar;
        this.d = ucsVar;
        this.e = uenVar;
        this.f = uhhVar;
        this.g = axnmVar;
        this.h = sncVar;
    }

    private final void d() {
        for (uih uihVar : (Set) this.g.get()) {
            uihVar.h();
        }
    }

    private static void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((aolq) it.next()).c);
        }
    }

    @Override // defpackage.udj
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
        if (android.text.TextUtils.isEmpty(r0.d) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ee, code lost:
        if (r0 == 5) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f6, code lost:
        if (android.text.TextUtils.isEmpty(r12.c) == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    @Override // defpackage.udj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Intent r24, defpackage.ubz r25, long r26) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udm.b(android.content.Intent, ubz, long):void");
    }

    @Override // defpackage.udj
    public final boolean c(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
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
        uev.e("GcmIntentHandler", "onReceive: %s \n %s", objArr);
        udn a2 = udn.a(intent);
        int i = a2.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        return (i2 == 0 || i2 == 1) ? !TextUtils.isEmpty(a2.a) : i2 == 2;
    }
}
