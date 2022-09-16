package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axve  reason: default package */
/* loaded from: classes3.dex */
public abstract class axve implements axvc {
    protected final ff a;
    protected final Resources b;
    private final dndp c;

    public axve(ff ffVar, dndp dndpVar) {
        this.a = ffVar;
        this.b = ffVar.getResources();
        this.c = dndpVar;
    }

    @Override // defpackage.axvc
    public abstract cjtd c();

    @Override // defpackage.axvc
    public cqkl e() {
        this.a.g().f();
        return cqkl.a;
    }

    @Override // defpackage.axvc
    public String i() {
        dndj j = j();
        if (j == null) {
            return "";
        }
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        dndl dndlVar = j.b;
        if (dndlVar == null) {
            dndlVar = dndl.d;
        }
        dndr b = dndr.b(dndlVar.b);
        if (b == null) {
            b = dndr.UNKNOWN_ALIAS_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            return this.b.getString(R.string.HOME_LOCATION);
        }
        return ordinal != 2 ? "" : this.b.getString(R.string.WORK_LOCATION);
    }

    @dzsi
    public final dndj j() {
        if (this.c.e.size() > 0) {
            dndj dndjVar = this.c.e.get(0);
            dndl dndlVar = dndjVar.b;
            if (dndlVar == null) {
                dndlVar = dndl.d;
            }
            dndr b = dndr.b(dndlVar.b);
            if (b == null) {
                b = dndr.UNKNOWN_ALIAS_TYPE;
            }
            if (b != dndr.HOME && b != dndr.WORK) {
                return null;
            }
            return dndjVar;
        }
        return null;
    }
}
