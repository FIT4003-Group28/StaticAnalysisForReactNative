package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aajb  reason: default package */
/* loaded from: classes.dex */
public final class aajb {
    public final aake a;
    public final afvm b;
    public final amqo c = aqxo.i(new amqo() { // from class: aaiy
        @Override // defpackage.amqo
        public final Object get() {
            aajb aajbVar = aajb.this;
            aakl aaklVar = aajbVar.e;
            afvm afvmVar = aajbVar.b;
            final aake aakeVar = aajbVar.a;
            voo vooVar = new voo();
            vooVar.a("CREATE TABLE entity_table(_id INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL,last_modified_datetime INTEGER DEFAULT 0,data_type INTEGER DEFAULT 0,metadata BLOB,entity BLOB NOT NULL)");
            vooVar.a("ALTER TABLE entity_table ADD batch_update_timestamp INTEGER DEFAULT 0");
            afzp afzpVar = new afzp();
            aqxo.u(true, "You should not include the PRAGMA in your statement: %s", "foreign_keys=ON");
            afzpVar.a.add("foreign_keys=ON");
            vooVar.d = afzpVar;
            vooVar.a("CREATE TABLE entity_associations(parent_entity_key TEXT NOT NULL, child_entity_key TEXT NOT NULL, PRIMARY KEY (parent_entity_key, child_entity_key))");
            vooVar.a.h(new voq() { // from class: aait
                @Override // defpackage.voq
                public final void a(vox voxVar) {
                    aake aakeVar2 = aake.this;
                    Cursor b = voxVar.b("SELECT key, entity, metadata FROM entity_table", new String[0]);
                    while (b.moveToNext()) {
                        try {
                            aais.b(voxVar, aakeVar2.a(b.getString(0), b.getBlob(1)));
                        } catch (Throwable th) {
                            if (b != null) {
                                try {
                                    b.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (b != null) {
                        b.close();
                    }
                }
            });
            if (vooVar.d == null) {
                vooVar.d = new afzp();
            }
            return aaklVar.a(afvmVar, new vor(vooVar.c, vooVar.a.g(), vooVar.b.g(), vooVar.d, null));
        }
    });
    public final amqo d;
    public final aakl e;

    public aajb(afvm afvmVar, aakl aaklVar, aake aakeVar, final azqb azqbVar, byte[] bArr) {
        this.b = afvmVar;
        this.e = aaklVar;
        this.a = aakeVar;
        this.d = aqxo.i(new amqo() { // from class: aaiz
            @Override // defpackage.amqo
            public final Object get() {
                aajb aajbVar = aajb.this;
                return new aaip((vno) aajbVar.c.get(), (Set) azqbVar.get(), aajbVar.a);
            }
        });
    }

    public static vou a() {
        vou vouVar = new vou();
        vouVar.b("SELECT ");
        vouVar.b("key");
        vouVar.b(", ");
        vouVar.b("entity");
        vouVar.b(", ");
        vouVar.b("metadata");
        vouVar.b(", ");
        vouVar.b("data_type");
        vouVar.b(", ");
        vouVar.b("batch_update_timestamp");
        vouVar.b(" FROM ");
        vouVar.b("entity_table");
        vouVar.b(" WHERE ");
        vouVar.b("key");
        return vouVar;
    }

    private static vot f(String str) {
        vou a = a();
        a.b("=?");
        a.c(str);
        return a.a();
    }

    public final aakd b(Cursor cursor, String str) {
        if (cursor == null) {
            String valueOf = String.valueOf(str);
            throw aahd.a(new SQLiteException(valueOf.length() != 0 ? "get got null cursor for key ".concat(valueOf) : new String("get got null cursor for key ")), 3);
        }
        aqxo.y(cursor.isBeforeFirst());
        if (cursor.getCount() > 1) {
            String valueOf2 = String.valueOf(str);
            throw aahd.a(new SQLiteException(valueOf2.length() != 0 ? "get expected at most 1 entity w/ key ".concat(valueOf2) : new String("get expected at most 1 entity w/ key ")), 3);
        } else if (!cursor.moveToNext()) {
            return aakd.a;
        } else {
            return d(cursor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aakd c(vox voxVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return aakd.a;
        }
        try {
            Cursor a = voxVar.a(f(str));
            aakd b = b(a, str);
            if (a != null) {
                a.close();
            }
            return b;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw aahd.a(e, 3);
        }
    }

    public final aakd d(Cursor cursor) {
        aorw aorwVar;
        aakc a = aakd.a();
        try {
            a.a = this.a.a(cursor.getString(cursor.getColumnIndexOrThrow("key")), cursor.getBlob(cursor.getColumnIndexOrThrow("entity")));
            try {
                byte[] blob = cursor.getBlob(cursor.getColumnIndex("metadata"));
                a.c(blob == null ? aajk.a : aajk.a(blob));
                try {
                    aorwVar = aosw.d(cursor.getLong(cursor.getColumnIndex("batch_update_timestamp")));
                } catch (Exception unused) {
                    aorwVar = aajz.a;
                }
                a.b(aorwVar);
                return a.a();
            } catch (Exception e) {
                throw aahd.b(e, cursor.getInt(cursor.getColumnIndex("data_type")), 3, 6);
            }
        } catch (Exception e2) {
            throw aahd.b(e2, cursor.getInt(cursor.getColumnIndex("data_type")), 3, 5);
        }
    }

    public final ankt e(String str) {
        vno vnoVar = (vno) this.c.get();
        if (TextUtils.isEmpty(str)) {
            return anlz.q(aakd.a);
        }
        final vot f = f(str);
        anjd c = vnoVar.a.b().c(ammo.d(new aniz() { // from class: vnm
            @Override // defpackage.aniz
            public final anjd a(anjb anjbVar, Object obj) {
                vot votVar = vot.this;
                vnv vnvVar = (vnv) obj;
                String str2 = votVar.a;
                Object[] objArr = votVar.b;
                vnvVar.a();
                vnu vnuVar = new vnu(vnvVar, objArr, str2);
                int i = von.a;
                vom vomVar = new vom(vnuVar);
                vnvVar.b.execute(ammo.f(vomVar));
                return anjd.a(vomVar, anjk.a);
            }
        }), anjk.a);
        aaja aajaVar = new aaja(this, str);
        anjk anjkVar = anjk.a;
        return c.g((anko) anii.i(c.c, new aniw(c, aajaVar), anjkVar)).h();
    }
}
