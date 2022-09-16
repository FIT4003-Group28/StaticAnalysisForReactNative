package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ajza  reason: default package */
/* loaded from: classes.dex */
public final class ajza implements ajya {
    final /* synthetic */ ajyc a;
    private final /* synthetic */ int b;

    public ajza(ajyc ajycVar) {
        this.a = ajycVar;
    }

    public ajza(ajyc ajycVar, int i) {
        this.b = i;
        this.a = ajycVar;
    }

    @Override // defpackage.ajya
    public final Map a() {
        if (this.b == 0) {
            return this.a.c();
        }
        return this.a.c();
    }
}
