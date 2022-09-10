package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cucf  reason: default package */
/* loaded from: classes5.dex */
public final class cucf extends ctza {
    private Set<String> b;
    private String d;
    private dbsg<String> a = dbpy.a;
    private dbsg<String> c = dbpy.a;

    @Override // defpackage.ctza
    public final void b(String str) {
        this.c = dbsg.i(str);
    }

    @Override // defpackage.ctza
    public final void c(String str) {
        this.a = dbsg.i(str);
    }

    @Override // defpackage.ctza
    public final void d(Set<String> set) {
        if (set != null) {
            this.b = set;
            return;
        }
        throw new NullPointerException("Null phoneNumbers");
    }

    @Override // defpackage.ctza
    public final void e(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null tachyonAppName");
    }

    @Override // defpackage.ctza
    public final ctzb a() {
        String str = this.b == null ? " phoneNumbers" : "";
        if (this.d == null) {
            str = str.concat(" tachyonAppName");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cucg(this.a, this.b, this.c, this.d);
    }
}
