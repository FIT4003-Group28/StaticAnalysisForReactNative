package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteMisuseException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.database.sqlite.SQLiteTableLockedException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aaik  reason: default package */
/* loaded from: classes.dex */
public final class aaik implements aahe, aaka {
    public final aajb c;
    public final Executor d;
    public final aaki e;
    private final snc g;
    private final aake h;
    private final amup i;
    private final aahc j;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public volatile boolean f = false;

    public aaik(afvm afvmVar, Executor executor, snc sncVar, amup amupVar, aakl aaklVar, azqb azqbVar, aaki aakiVar, aahc aahcVar, azqb azqbVar2, byte[] bArr) {
        this.g = sncVar;
        this.d = executor;
        this.i = amupVar;
        this.e = aakiVar;
        aake aakeVar = new aake(azqbVar, this);
        this.h = aakeVar;
        this.j = aahcVar;
        this.c = new aajb(afvmVar, aaklVar, aakeVar, azqbVar2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aahd k() {
        return aahd.a(new IllegalStateException("Store has been disposed."), 1);
    }

    @Override // defpackage.aahe
    public final ayos a(final String str) {
        if (this.f) {
            return ayos.x(k());
        }
        return zna.s(((vno) this.c.c.get()).a(new vow() { // from class: aaix
            @Override // defpackage.vow
            public final Object a(vox voxVar) {
                String str2 = str;
                amvl amvlVar = new amvl();
                Cursor b = voxVar.b("SELECT DISTINCT parent_entity_key FROM entity_associations WHERE child_entity_key=?", str2);
                while (b.moveToNext()) {
                    try {
                        amvlVar.c(b.getString(0));
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
                return amvlVar.g();
            }
        }));
    }

    @Override // defpackage.aajl
    public final aajj b(String str) {
        return (aajj) f(str).W();
    }

    @Override // defpackage.aaka
    public final aajs d(aorw aorwVar) {
        aahy c = c();
        c.a = aorwVar;
        return c;
    }

    @Override // defpackage.aahe
    public final ayos e(final aahl aahlVar) {
        if (this.f) {
            return ayos.x(k());
        }
        final aaip aaipVar = (aaip) this.c.d.get();
        return zna.s(aaipVar.c.a(new vow() { // from class: aail
            @Override // defpackage.vow
            public final Object a(vox voxVar) {
                aaip aaipVar2 = aaip.this;
                aahl aahlVar2 = aahlVar;
                aaipVar2.b(voxVar);
                if (!aaipVar2.a.contains(aahlVar2.a)) {
                    throw new IllegalArgumentException("QueryTable missing, did you forget to inject it?");
                }
                amuf amufVar = new amuf();
                Cursor a = voxVar.a(aahlVar2.b);
                while (a.moveToNext()) {
                    try {
                        amufVar.h(a.getString(0));
                    } catch (Throwable th) {
                        if (a != null) {
                            try {
                                a.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                if (a != null) {
                    a.close();
                }
                return amufVar.g();
            }
        }));
    }

    @Override // defpackage.aajl
    public final ayoc f(String str) {
        if (this.f) {
            return ayoc.q(k());
        }
        return zhn.a(anii.h(anko.q(this.c.e(str)), ydy.s, anjk.a)).m(new ayqb() { // from class: aaih
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aaik.this.o((Throwable) obj);
            }
        });
    }

    @Override // defpackage.aajl
    public final ayoi g(Class cls) {
        return m(cls).R();
    }

    @Override // defpackage.aajl
    public final ayoi h(String str, boolean z) {
        ayoi R = n(str).R();
        return z ? ayoi.z(new aaie(this, str, R, 1)) : R;
    }

    @Override // defpackage.aajl
    public final ayoi i(String str) {
        return ayoi.z(new aaie(this, str, n(str).V(yps.t)));
    }

    @Override // defpackage.aahe
    public final ayos j(final int i) {
        if (this.f) {
            return ayos.x(k());
        }
        return zna.s(((vno) this.c.c.get()).a(new vow() { // from class: aaiu
            @Override // defpackage.vow
            public final Object a(vox voxVar) {
                int i2 = i;
                vou vouVar = new vou();
                vouVar.b("SELECT ");
                vouVar.b("key");
                vouVar.b(" FROM ");
                vouVar.b("entity_table");
                vouVar.b(" WHERE ");
                vouVar.b("data_type");
                vouVar.b(" = ?");
                vouVar.c(Integer.toString(i2));
                try {
                    Cursor a = voxVar.a(vouVar.a());
                    amuf amufVar = new amuf();
                    while (a.moveToNext()) {
                        amufVar.h(a.getString(a.getColumnIndex("key")));
                    }
                    amuk g = amufVar.g();
                    if (a != null) {
                        a.close();
                    }
                    return g;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw aahd.a(e, 3);
                }
            }
        }));
    }

    @Override // defpackage.aajl
    /* renamed from: l */
    public final aahy c() {
        return new aahy(this.c, new aaif(this), new aaic(this), new aaig(this), this.h, this.g, this.i);
    }

    public final aajy m(final Class cls) {
        aajy aajyVar = (aajy) this.b.get(cls);
        if (aajyVar == null) {
            synchronized (this.b) {
                aajyVar = (aajy) this.b.get(cls);
                if (aajyVar == null) {
                    aajyVar = aajy.e(new Runnable() { // from class: aaii
                        @Override // java.lang.Runnable
                        public final void run() {
                            aaik aaikVar = aaik.this;
                            aaikVar.b.remove(cls);
                        }
                    });
                    this.b.put(cls, aajyVar);
                }
            }
        }
        return aajyVar;
    }

    public final aajy n(final String str) {
        aajy aajyVar = (aajy) this.a.get(str);
        if (aajyVar == null) {
            synchronized (this.a) {
                aajyVar = (aajy) this.a.get(str);
                if (aajyVar == null) {
                    aajyVar = aajy.e(new Runnable() { // from class: aaid
                        @Override // java.lang.Runnable
                        public final void run() {
                            aaik aaikVar = aaik.this;
                            aaikVar.a.remove(str);
                        }
                    });
                    this.a.put(str, aajyVar);
                }
            }
        }
        return aajyVar;
    }

    public final void o(Throwable th) {
        Throwable c = amqs.c(th);
        if (c instanceof aahd) {
            aahd aahdVar = (aahd) c;
            aahc aahcVar = this.j;
            if (aahdVar.b) {
                return;
            }
            aahdVar.b = true;
            if (!aahcVar.a) {
                return;
            }
            aopa createBuilder = aqvv.a.createBuilder();
            int i = aahdVar.d;
            createBuilder.copyOnWrite();
            aqvv aqvvVar = (aqvv) createBuilder.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            aqvvVar.f = i2;
            aqvvVar.b |= 8;
            createBuilder.copyOnWrite();
            aqvv aqvvVar2 = (aqvv) createBuilder.instance;
            aqvvVar2.c = 2;
            aqvvVar2.b |= 1;
            int i3 = aahdVar.c;
            createBuilder.copyOnWrite();
            aqvv aqvvVar3 = (aqvv) createBuilder.instance;
            int i4 = i3 - 1;
            if (i3 != 0) {
                aqvvVar3.e = i4;
                aqvvVar3.b |= 4;
                Throwable cause = aahdVar.getCause();
                if (cause instanceof SQLiteAbortException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar4 = (aqvv) createBuilder.instance;
                    aqvvVar4.g = 17;
                    aqvvVar4.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar5 = (aqvv) createBuilder.instance;
                    aqvvVar5.f = 3;
                    aqvvVar5.b |= 8;
                } else if (cause instanceof SQLiteAccessPermException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar6 = (aqvv) createBuilder.instance;
                    aqvvVar6.g = 2;
                    aqvvVar6.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar7 = (aqvv) createBuilder.instance;
                    aqvvVar7.f = 3;
                    aqvvVar7.b |= 8;
                } else if (cause instanceof SQLiteBindOrColumnIndexOutOfRangeException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar8 = (aqvv) createBuilder.instance;
                    aqvvVar8.g = 3;
                    aqvvVar8.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar9 = (aqvv) createBuilder.instance;
                    aqvvVar9.f = 3;
                    aqvvVar9.b |= 8;
                } else if (cause instanceof SQLiteBlobTooBigException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar10 = (aqvv) createBuilder.instance;
                    aqvvVar10.g = 4;
                    aqvvVar10.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar11 = (aqvv) createBuilder.instance;
                    aqvvVar11.f = 3;
                    aqvvVar11.b |= 8;
                } else if (cause instanceof SQLiteCantOpenDatabaseException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar12 = (aqvv) createBuilder.instance;
                    aqvvVar12.g = 5;
                    aqvvVar12.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar13 = (aqvv) createBuilder.instance;
                    aqvvVar13.f = 3;
                    aqvvVar13.b |= 8;
                } else if (cause instanceof SQLiteConstraintException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar14 = (aqvv) createBuilder.instance;
                    aqvvVar14.g = 6;
                    aqvvVar14.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar15 = (aqvv) createBuilder.instance;
                    aqvvVar15.f = 3;
                    aqvvVar15.b |= 8;
                } else if (cause instanceof SQLiteDatabaseCorruptException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar16 = (aqvv) createBuilder.instance;
                    aqvvVar16.g = 7;
                    aqvvVar16.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar17 = (aqvv) createBuilder.instance;
                    aqvvVar17.f = 3;
                    aqvvVar17.b |= 8;
                } else if (cause instanceof SQLiteDatabaseLockedException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar18 = (aqvv) createBuilder.instance;
                    aqvvVar18.g = 8;
                    aqvvVar18.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar19 = (aqvv) createBuilder.instance;
                    aqvvVar19.f = 3;
                    aqvvVar19.b |= 8;
                } else if (cause instanceof SQLiteDatatypeMismatchException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar20 = (aqvv) createBuilder.instance;
                    aqvvVar20.g = 9;
                    aqvvVar20.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar21 = (aqvv) createBuilder.instance;
                    aqvvVar21.f = 3;
                    aqvvVar21.b |= 8;
                } else if (cause instanceof SQLiteDiskIOException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar22 = (aqvv) createBuilder.instance;
                    aqvvVar22.g = 10;
                    aqvvVar22.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar23 = (aqvv) createBuilder.instance;
                    aqvvVar23.f = 3;
                    aqvvVar23.b |= 8;
                } else if (cause instanceof SQLiteDoneException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar24 = (aqvv) createBuilder.instance;
                    aqvvVar24.g = 11;
                    aqvvVar24.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar25 = (aqvv) createBuilder.instance;
                    aqvvVar25.f = 3;
                    aqvvVar25.b |= 8;
                } else if (cause instanceof SQLiteFullException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar26 = (aqvv) createBuilder.instance;
                    aqvvVar26.g = 12;
                    aqvvVar26.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar27 = (aqvv) createBuilder.instance;
                    aqvvVar27.f = 3;
                    aqvvVar27.b |= 8;
                } else if (cause instanceof SQLiteMisuseException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar28 = (aqvv) createBuilder.instance;
                    aqvvVar28.g = 13;
                    aqvvVar28.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar29 = (aqvv) createBuilder.instance;
                    aqvvVar29.f = 3;
                    aqvvVar29.b |= 8;
                } else if (cause instanceof SQLiteOutOfMemoryException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar30 = (aqvv) createBuilder.instance;
                    aqvvVar30.g = 14;
                    aqvvVar30.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar31 = (aqvv) createBuilder.instance;
                    aqvvVar31.f = 3;
                    aqvvVar31.b |= 8;
                } else if (cause instanceof SQLiteReadOnlyDatabaseException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar32 = (aqvv) createBuilder.instance;
                    aqvvVar32.g = 15;
                    aqvvVar32.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar33 = (aqvv) createBuilder.instance;
                    aqvvVar33.f = 3;
                    aqvvVar33.b |= 8;
                } else if (cause instanceof SQLiteTableLockedException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar34 = (aqvv) createBuilder.instance;
                    aqvvVar34.g = 16;
                    aqvvVar34.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar35 = (aqvv) createBuilder.instance;
                    aqvvVar35.f = 3;
                    aqvvVar35.b |= 8;
                } else if (cause instanceof SQLiteException) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar36 = (aqvv) createBuilder.instance;
                    aqvvVar36.g = 1;
                    aqvvVar36.b |= 64;
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar37 = (aqvv) createBuilder.instance;
                    aqvvVar37.f = 3;
                    aqvvVar37.b |= 8;
                }
                int i5 = aahdVar.a;
                if (i5 > 0) {
                    createBuilder.copyOnWrite();
                    aqvv aqvvVar38 = (aqvv) createBuilder.instance;
                    aqvvVar38.b = 2 | aqvvVar38.b;
                    aqvvVar38.d = i5;
                }
                aahcVar.a((aqvv) createBuilder.mo39build());
                return;
            }
            throw null;
        } else if (!this.j.a) {
        } else {
            aopa createBuilder2 = aqvv.a.createBuilder();
            createBuilder2.copyOnWrite();
            aqvv aqvvVar39 = (aqvv) createBuilder2.instance;
            aqvvVar39.f = 0;
            aqvvVar39.b = 8 | aqvvVar39.b;
            createBuilder2.copyOnWrite();
            aqvv aqvvVar40 = (aqvv) createBuilder2.instance;
            aqvvVar40.c = 2;
            aqvvVar40.b |= 1;
            createBuilder2.copyOnWrite();
            aqvv aqvvVar41 = (aqvv) createBuilder2.instance;
            aqvvVar41.e = 0;
            aqvvVar41.b = 4 | aqvvVar41.b;
            this.j.a((aqvv) createBuilder2.mo39build());
        }
    }
}
