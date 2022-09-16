package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acrb  reason: default package */
/* loaded from: classes2.dex */
public class acrb implements acqv {
    final /* synthetic */ acrg a;

    public acrb(acrg acrgVar) {
        this.a = acrgVar;
    }

    @Override // defpackage.acqv
    public Boolean a() {
        acrg acrgVar = this.a;
        boolean z = false;
        if (acrgVar.m && acrgVar.b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.acqv
    public Boolean b() {
        boolean z;
        Iterator<dvvs> it = this.a.f.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (!it.next().f.isEmpty()) {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
