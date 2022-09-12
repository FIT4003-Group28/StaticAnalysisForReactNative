package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: broh  reason: default package */
/* loaded from: classes4.dex */
public abstract class broh implements Serializable {
    @dzsi
    public final bwrs<ilo> a;

    public broh(@dzsi bwrs<ilo> bwrsVar) {
        this.a = bwrsVar;
    }

    public abstract boolean a();

    public final boolean c() {
        return d() != null;
    }

    @dzsi
    public ilo d() {
        bwrs<ilo> bwrsVar = this.a;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }
}
