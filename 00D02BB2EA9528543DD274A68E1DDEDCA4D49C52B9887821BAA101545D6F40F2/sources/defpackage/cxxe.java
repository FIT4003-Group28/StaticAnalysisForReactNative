package defpackage;

import com.google.android.libraries.social.populous.AutoValue_Autocompletion;
import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.Group;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ContactMethodField;
/* compiled from: PG */
/* renamed from: cxxe  reason: default package */
/* loaded from: classes5.dex */
public final class cxxe extends cxyf {
    public Person a;
    public Group b;
    private dcdc<ContactMethodField> c;
    private int d;

    @Override // defpackage.cxyf
    @dzsi
    protected final Person a() {
        return this.a;
    }

    @Override // defpackage.cxyf
    @dzsi
    protected final Group b() {
        return this.b;
    }

    @Override // defpackage.cxyf
    public final void d(dcdc<ContactMethodField> dcdcVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            return;
        }
        throw new NullPointerException("Null matchesList");
    }

    @Override // defpackage.cxyf
    protected final void e(int i) {
        this.d = i;
    }

    @Override // defpackage.cxyf
    protected final Autocompletion c() {
        String str = this.d == 0 ? " objectType" : "";
        if (this.c == null) {
            str = str.concat(" matchesList");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_Autocompletion(this.d, this.c, this.a, this.b);
    }
}
