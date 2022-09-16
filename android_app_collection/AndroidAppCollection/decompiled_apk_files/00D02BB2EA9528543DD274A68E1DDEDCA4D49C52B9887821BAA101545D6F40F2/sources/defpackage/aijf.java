package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* renamed from: aijf  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aijf implements dbrn {
    static final dbrn a = new aijf();

    private aijf() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String valueOf = String.valueOf(Integer.toHexString(System.identityHashCode((PersonId) obj)));
        return valueOf.length() != 0 ? "#".concat(valueOf) : new String("#");
    }
}
