package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: umq  reason: default package */
/* loaded from: classes.dex */
public final class umq extends afhx {
    public static final dbsl<afga> a = ump.a;
    private final ros b;
    private final qbt c;
    private final acyp d;

    public umq(Intent intent, @dzsi String str, ros rosVar, qbt qbtVar, acyp acypVar) {
        super(intent, str, afid.COMMUTE_SETTINGS);
        this.b = rosVar;
        this.c = qbtVar;
        this.d = acypVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        if (this.d.d()) {
            this.c.N();
        } else {
            this.b.e();
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return durz.EIT_COMMUTE_SETTINGS;
    }
}
