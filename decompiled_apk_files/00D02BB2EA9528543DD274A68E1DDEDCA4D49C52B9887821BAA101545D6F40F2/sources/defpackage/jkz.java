package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: jkz  reason: default package */
/* loaded from: classes7.dex */
public final class jkz implements cqkv {
    final cqlg a;

    public jkz(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        CharSequence b;
        CharSequence a;
        View view = cqjzVar.c;
        if (cqkuVar instanceof jkx) {
            jkx jkxVar = jkx.FIELDS;
            int ordinal = ((jkx) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof jky) || !(obj instanceof List)) {
                    return false;
                }
                ((jky) view).b = dcdc.r((List) obj);
                return true;
            } else if (ordinal != 1 || !(view instanceof jky)) {
                return false;
            } else {
                if (!(obj instanceof cqsn) || (a = this.a.a(view, (cqsn) obj)) == null) {
                    if (!(obj instanceof Integer) || (b = this.a.b(view, ((Integer) obj).intValue())) == null) {
                        if (!(obj instanceof CharSequence)) {
                            return false;
                        }
                        ((jky) view).a = (CharSequence) obj;
                        return true;
                    }
                    ((jky) view).a = b;
                    return true;
                }
                ((jky) view).a = a;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
