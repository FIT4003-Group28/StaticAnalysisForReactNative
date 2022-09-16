package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: anzb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class anzb implements anyr {
    private final /* synthetic */ int c;
    public static final /* synthetic */ anzb b = new anzb(1);
    public static final /* synthetic */ anzb a = new anzb();

    private /* synthetic */ anzb() {
    }

    private /* synthetic */ anzb(int i) {
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anyn
    public final void a(Object obj, Object obj2) {
        if (this.c == 0) {
            String valueOf = String.valueOf(obj.getClass().getCanonicalName());
            throw new anyo(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
        }
        Map.Entry entry = (Map.Entry) obj;
        obj2.b(anza.a, entry.getKey());
        obj2.b(anza.b, entry.getValue());
    }
}
