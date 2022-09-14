package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: mgu  reason: default package */
/* loaded from: classes7.dex */
final class mgu implements Comparator<mhk> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(mhk mhkVar, mhk mhkVar2) {
        mhk mhkVar3 = mhkVar;
        mhk mhkVar4 = mhkVar2;
        if (!mhkVar3.d().booleanValue() || mhkVar4.d().booleanValue()) {
            return (mhkVar3.d().booleanValue() || !mhkVar4.d().booleanValue()) ? 0 : 1;
        }
        return -1;
    }
}
