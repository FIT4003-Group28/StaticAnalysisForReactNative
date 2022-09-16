package defpackage;
/* compiled from: PG */
/* renamed from: aitl  reason: default package */
/* loaded from: classes.dex */
public final class aitl {
    public ampq a = amon.a;
    public String b;
    private final yve c;
    private final azpb d;
    private final azpb e;
    private final axxb f;

    public aitl(yve yveVar, azpb azpbVar, azpb azpbVar2, axxb axxbVar) {
        this.c = yveVar;
        this.d = azpbVar;
        this.e = azpbVar2;
        this.f = axxbVar;
    }

    public final ankt a() {
        if (this.f.b().booleanValue()) {
            this.d.c(this.a);
            String str = this.b;
            if (str != null) {
                if (!str.isEmpty()) {
                    this.e.c(ampq.j(this.b));
                } else {
                    this.e.c(amon.a);
                }
            }
            return ankq.a;
        }
        return this.c.b(new ampg() { // from class: aitk
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aitl aitlVar = aitl.this;
                aopa mo52toBuilder = ((awve) obj).mo52toBuilder();
                if (!aitlVar.a.h()) {
                    mo52toBuilder.copyOnWrite();
                    awve awveVar = (awve) mo52toBuilder.instance;
                    awveVar.b &= -2;
                    awveVar.c = false;
                } else {
                    boolean booleanValue = ((Boolean) aitlVar.a.c()).booleanValue();
                    mo52toBuilder.copyOnWrite();
                    awve awveVar2 = (awve) mo52toBuilder.instance;
                    awveVar2.b |= 1;
                    awveVar2.c = booleanValue;
                }
                String str2 = aitlVar.b;
                if (str2 != null) {
                    if (str2.isEmpty()) {
                        mo52toBuilder.copyOnWrite();
                        awve awveVar3 = (awve) mo52toBuilder.instance;
                        awveVar3.b &= -3;
                        awveVar3.d = awve.a.d;
                    } else {
                        String str3 = aitlVar.b;
                        mo52toBuilder.copyOnWrite();
                        awve awveVar4 = (awve) mo52toBuilder.instance;
                        str3.getClass();
                        awveVar4.b |= 2;
                        awveVar4.d = str3;
                    }
                }
                return (awve) mo52toBuilder.mo39build();
            }
        });
    }

    public final void b(Boolean bool) {
        this.a = ampq.i(bool);
    }
}
