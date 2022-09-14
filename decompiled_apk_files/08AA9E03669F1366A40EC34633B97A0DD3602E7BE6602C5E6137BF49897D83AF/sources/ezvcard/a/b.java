package ezvcard.a;

import ezvcard.VCard;
import ezvcard.property.VCardProperty;
/* compiled from: EmbeddedVCardException.java */
/* loaded from: classes.dex */
public class b extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final VCard f5474a = null;

    /* renamed from: b  reason: collision with root package name */
    private final a f5475b;

    /* compiled from: EmbeddedVCardException.java */
    /* loaded from: classes.dex */
    public interface a {
        VCardProperty a();

        void a(VCard vCard);
    }

    public b(a aVar) {
        this.f5475b = aVar;
    }

    public void a(VCard vCard) {
        if (this.f5475b == null) {
            return;
        }
        this.f5475b.a(vCard);
    }

    public VCardProperty a() {
        if (this.f5475b == null) {
            return null;
        }
        return this.f5475b.a();
    }
}
