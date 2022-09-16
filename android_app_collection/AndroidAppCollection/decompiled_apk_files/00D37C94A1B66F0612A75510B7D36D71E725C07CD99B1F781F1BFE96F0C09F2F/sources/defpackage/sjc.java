package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;
/* compiled from: PG */
/* renamed from: sjc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class sjc implements sit {
    private final /* synthetic */ int d;
    public static final /* synthetic */ sjc c = new sjc(2);
    public static final /* synthetic */ sjc b = new sjc(1);
    public static final /* synthetic */ sjc a = new sjc();

    private /* synthetic */ sjc() {
    }

    private /* synthetic */ sjc(int i) {
        this.d = i;
    }

    @Override // defpackage.sit
    public final Object a(Object obj) {
        int i = this.d;
        if (i != 0) {
            return i != 1 ? new sje((RuntimeJni) obj) : obj;
        }
        return new sja((ExperienceJni) obj);
    }
}
