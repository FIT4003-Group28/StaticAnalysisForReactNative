package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: asbw  reason: default package */
/* loaded from: classes2.dex */
final class asbw extends asby {
    private dqvj a;
    private List<amvh> b;
    private Boolean c;

    @Override // defpackage.asby
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.asby
    public final void c(List<amvh> list) {
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null fakeImplicitDestinations");
    }

    @Override // defpackage.asby
    public final void d(dqvj dqvjVar) {
        if (dqvjVar != null) {
            this.a = dqvjVar;
            return;
        }
        throw new NullPointerException("Null travelMode");
    }

    @Override // defpackage.asby
    public final asbz a() {
        String str = this.a == null ? " travelMode" : "";
        if (this.b == null) {
            str = str.concat(" fakeImplicitDestinations");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" exitOnArrivalAtDestination");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new asbx(this.a, this.b, this.c.booleanValue());
    }
}
