package ezvcard.a.a;

import ezvcard.VCard;
import ezvcard.a.a.b;
import ezvcard.a.f;
import java.io.InputStream;
/* compiled from: ChainingTextParser.java */
/* loaded from: classes.dex */
public class b<T extends b<?>> extends a<T> {
    private boolean h;

    @Override // ezvcard.a.a.a
    public /* bridge */ /* synthetic */ VCard a() {
        return super.a();
    }

    public b(InputStream inputStream) {
        super(inputStream);
        this.h = true;
    }

    @Override // ezvcard.a.a.a
    f b() {
        ezvcard.a.c.a c2 = c();
        c2.a(this.h);
        return c2;
    }

    private ezvcard.a.c.a c() {
        if (this.f5470a != null) {
            return new ezvcard.a.c.a(this.f5470a);
        }
        if (this.f5471b != null) {
            return new ezvcard.a.c.a(this.f5471b);
        }
        if (this.f5472c != null) {
            return new ezvcard.a.c.a(this.f5472c);
        }
        return new ezvcard.a.c.a(this.f5473d);
    }
}
