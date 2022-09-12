package defpackage;

import java.util.Comparator;
/* renamed from: aiwn  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aiwn implements Comparator {
    static final Comparator a = new aiwn();

    private aiwn() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        aixt aixtVar = (aixt) obj;
        aixt aixtVar2 = (aixt) obj2;
        if (!aixtVar.b() || !aixtVar2.b()) {
            if (aixtVar.b()) {
                return 1;
            }
            if (!aixtVar2.b()) {
                return aixtVar.d().toString().compareTo(aixtVar2.d().toString());
            }
            return -1;
        }
        return 0;
    }
}
