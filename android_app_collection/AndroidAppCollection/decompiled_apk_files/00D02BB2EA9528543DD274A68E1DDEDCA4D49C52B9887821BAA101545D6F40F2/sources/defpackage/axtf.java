package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: axtf  reason: default package */
/* loaded from: classes3.dex */
final class axtf implements axuc {
    @dzsi
    private final axuc a;

    public axtf(@dzsi axuc axucVar) {
        this.a = axucVar;
    }

    @Override // defpackage.axuc
    public final axub a(Activity activity) {
        return new axte(activity, this.a);
    }
}
