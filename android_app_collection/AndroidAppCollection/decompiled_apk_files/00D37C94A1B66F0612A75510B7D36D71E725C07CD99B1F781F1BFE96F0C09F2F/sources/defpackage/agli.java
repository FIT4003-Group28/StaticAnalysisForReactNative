package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
/* compiled from: PG */
/* renamed from: agli  reason: default package */
/* loaded from: classes.dex */
public final class agli {
    public agij a;
    private final String b;
    private final agmb c;
    private final aglh d = new aglh(this);
    private final agkr e;
    private agma f;

    public agli(agmb agmbVar, agkr agkrVar, String str) {
        this.b = str;
        this.c = agmbVar;
        this.e = agkrVar;
    }

    public final synchronized SQLiteDatabase a() {
        try {
            if (this.f == null) {
                agmb agmbVar = this.c;
                String str = this.b;
                aglh aglhVar = this.d;
                snc sncVar = (snc) agmbVar.a.get();
                sncVar.getClass();
                Context context = (Context) agmbVar.b.get();
                context.getClass();
                aacz aaczVar = (aacz) agmbVar.c.get();
                aaczVar.getClass();
                agpj agpjVar = (agpj) agmbVar.d.get();
                agpjVar.getClass();
                aglhVar.getClass();
                this.f = new agma(sncVar, context, aaczVar, agpjVar, str, aglhVar);
            }
        } catch (SQLiteException e) {
            e = e;
            for (int i = 0; i < this.e.g; i++) {
                try {
                    return this.f.getWritableDatabase();
                } catch (SQLiteException e2) {
                    zep.d("SQLiteException when retrying to get offline database", e2);
                }
            }
            throw e;
        }
        return this.f.getWritableDatabase();
    }
}
