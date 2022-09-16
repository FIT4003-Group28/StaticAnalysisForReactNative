package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agma  reason: default package */
/* loaded from: classes.dex */
public final class agma extends ymv {
    public final snc a;
    public final agpj c;
    private final zer d;
    private final aacz e;
    private final aglh f;

    public agma(snc sncVar, Context context, aacz aaczVar, agpj agpjVar, String str, aglh aglhVar) {
        super(context, str, 37);
        this.d = new aglu(this);
        this.a = sncVar;
        this.c = agpjVar;
        this.f = aglhVar;
        this.e = aaczVar;
        atqk n = ahdf.n(aaczVar);
        if (n == null || !n.e) {
            return;
        }
        setWriteAheadLoggingEnabled(true);
        yvv.d(this, 60000L);
    }

    public static void c(Map map, String str, ContentValues contentValues) {
        map.put(str, contentValues);
    }

    @Override // defpackage.ymv
    protected final ymu a(int i) {
        boolean z = false;
        if (i >= 0 && i < 37) {
            z = true;
        }
        aqxo.p(z);
        return (ymu) ((List) this.d.get()).get(i);
    }

    @Override // defpackage.ymv
    protected final void b(SQLiteDatabase sQLiteDatabase) {
        ymr.f(sQLiteDatabase);
        aglh aglhVar = this.f;
        if (aglhVar != null) {
            agij agijVar = aglhVar.a.a;
            agpj agpjVar = (agpj) agijVar.a.s.get();
            agpj.u(agpjVar.a, agpjVar.d, agpjVar.b, agpjVar.e);
            agpi agpiVar = agpjVar.f;
            if (agpiVar != null) {
                ((aghc) agpiVar).h();
            }
            agio agioVar = agijVar.a;
            agioVar.e.a(agioVar.I);
            agio agioVar2 = agijVar.a;
            agioVar2.f.a(agioVar2.I);
            agio agioVar3 = agijVar.a;
            agioVar3.g.a(agioVar3.I);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f != null) {
            sQLiteDatabase.delete("playlistsV13", "placeholder = ?", new String[]{ymr.b(true).toString()});
        }
    }
}
