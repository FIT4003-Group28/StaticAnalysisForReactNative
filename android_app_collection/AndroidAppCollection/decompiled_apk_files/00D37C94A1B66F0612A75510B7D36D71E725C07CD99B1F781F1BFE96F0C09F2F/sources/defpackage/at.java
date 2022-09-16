package defpackage;

import java.io.InvalidObjectException;
import java.text.Format;
/* compiled from: PG */
/* renamed from: at  reason: default package */
/* loaded from: classes2.dex */
public final class at extends Format.Field {
    public static final at a = new at();
    private static final long serialVersionUID = 7510380454602616157L;

    protected at() {
        super("message argument field");
    }

    @Override // java.text.AttributedCharacterIterator.Attribute
    protected Object readResolve() {
        if (getClass() != at.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        String name = getName();
        at atVar = a;
        if (!name.equals(atVar.getName())) {
            throw new InvalidObjectException("Unknown attribute name.");
        }
        return atVar;
    }
}
