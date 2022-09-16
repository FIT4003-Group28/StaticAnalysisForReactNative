package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: uvy  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uvy implements amqo {
    public final /* synthetic */ azqb a;
    private final /* synthetic */ int b;

    public /* synthetic */ uvy(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        switch (this.b) {
            case 0:
                return (uwb) this.a.get();
            case 1:
                return (ajrx) this.a.get();
            case 2:
                return (yzj) this.a.get();
            case 3:
                return (aafo) this.a.get();
            case 4:
                return (yqw) this.a.get();
            case 5:
                return (yqw) this.a.get();
            case 6:
                return (abfp) this.a.get();
            default:
                return (File) this.a.get();
        }
    }
}
