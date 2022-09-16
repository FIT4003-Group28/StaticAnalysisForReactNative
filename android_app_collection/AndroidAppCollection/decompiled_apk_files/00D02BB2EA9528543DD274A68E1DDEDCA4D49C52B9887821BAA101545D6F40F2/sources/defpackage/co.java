package defpackage;

import java.io.InvalidObjectException;
import java.text.Format;
/* compiled from: PG */
/* renamed from: co  reason: default package */
/* loaded from: classes5.dex */
public final class co extends Format.Field {
    public static final co a = new co();
    private static final long serialVersionUID = 7510380454602616157L;

    protected co() {
        super("message argument field");
    }

    @Override // java.text.AttributedCharacterIterator.Attribute
    protected Object readResolve() {
        if (getClass() != co.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        String name = getName();
        co coVar = a;
        if (!name.equals(coVar.getName())) {
            throw new InvalidObjectException("Unknown attribute name.");
        }
        return coVar;
    }
}
