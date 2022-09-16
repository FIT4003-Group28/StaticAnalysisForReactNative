package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: ctgb  reason: default package */
/* loaded from: classes5.dex */
public final class ctgb extends SQLiteOpenHelper {
    static final String[] b = {"id", "conversation_type", "conversation_group_id", "conversation_group_app_name", "other_contact_row_id", "update_timestamp_us", "owner_row_id", "conversation_app_data", "conversation_properties"};
    public final dbsg a;
    private final Context c;
    private final dehp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctgb(Context context, long j, dbsg dbsgVar) {
        super(context, String.format("lighter_messaging_%d.db", Long.valueOf(j)), (SQLiteDatabase.CursorFactory) null, 25);
        boolean z = true;
        this.d = cstu.b().a;
        dbsk.b(j < 0 ? false : z, "registrationId is invalid; ensure AccountContext is valid");
        this.c = context;
        this.a = dbsgVar;
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(ctlz.b);
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
        sQLiteDatabase.execSQL("CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
        sQLiteDatabase.execSQL("CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)");
        sQLiteDatabase.execSQL("CREATE TABLE kvstore (key TEXT UNIQUE NOT NULL,value BLOB NOT NULL)");
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        ctiw.d(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r5.length()     // Catch: android.database.SQLException -> L3e
            int r0 = r0 + 26
            int r1 = r6.length()     // Catch: android.database.SQLException -> L3e
            int r0 = r0 + r1
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: android.database.SQLException -> L3e
            int r1 = r1.length()     // Catch: android.database.SQLException -> L3e
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L3e
            r1.<init>(r0)     // Catch: android.database.SQLException -> L3e
            java.lang.String r0 = "ALTER TABLE "
            r1.append(r0)     // Catch: android.database.SQLException -> L3e
            r1.append(r5)     // Catch: android.database.SQLException -> L3e
            java.lang.String r0 = " ADD COLUMN "
            r1.append(r0)     // Catch: android.database.SQLException -> L3e
            r1.append(r6)     // Catch: android.database.SQLException -> L3e
            java.lang.String r0 = " "
            r1.append(r0)     // Catch: android.database.SQLException -> L3e
            r1.append(r7)     // Catch: android.database.SQLException -> L3e
            java.lang.String r7 = ";"
            r1.append(r7)     // Catch: android.database.SQLException -> L3e
            java.lang.String r7 = r1.toString()     // Catch: android.database.SQLException -> L3e
            r4.execSQL(r7)     // Catch: android.database.SQLException -> L3e
            return
        L3e:
            r7 = move-exception
            r0 = 0
            r1 = 0
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            java.lang.String r2 = "select * from "
            r3.append(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            r3.append(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            java.lang.String r2 = " limit 0"
            r3.append(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            android.database.Cursor r0 = r4.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            if (r0 == 0) goto L6e
            int r4 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L7a
            r5 = -1
            if (r4 == r5) goto L6e
            r1 = 1
            goto L6e
        L6c:
            r4 = move-exception
            goto Lb8
        L6e:
            if (r0 == 0) goto Lb4
            boolean r4 = r0.isClosed()
            if (r4 != 0) goto Lb4
            r0.close()
            goto Lb4
        L7a:
            java.lang.String r4 = "Messaging SqliteHelper"
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L6c
            int r2 = r2 + 34
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L6c
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "failed to check column "
            r3.append(r2)     // Catch: java.lang.Throwable -> L6c
            r3.append(r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = " in table "
            r3.append(r6)     // Catch: java.lang.Throwable -> L6c
            r3.append(r5)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "."
            r3.append(r5)     // Catch: java.lang.Throwable -> L6c
            r3.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.cstl.a(r4)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto Lb4
            boolean r4 = r0.isClosed()
            if (r4 == 0) goto Lb0
            goto Lb4
        Lb0:
            r0.close()
            goto Lb7
        Lb4:
            if (r1 == 0) goto Lb7
            return
        Lb7:
            throw r7
        Lb8:
            if (r0 == 0) goto Lc3
            boolean r5 = r0.isClosed()
            if (r5 != 0) goto Lc3
            r0.close()
        Lc3:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctgb.c(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static dbsg<dxtx> d(byte[] bArr) {
        try {
            return dbsg.i((dxtx) dsqw.cr(dxtx.e, bArr, dsqa.c()));
        } catch (dsrm unused) {
            return dbpy.a;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 < 19) {
            b(sQLiteDatabase);
            return;
        }
        while (true) {
            i--;
            if (i < i2) {
                return;
            }
            if (i == 19) {
                ctiw.h(sQLiteDatabase, "messages", ctlz.b, ctlz.a);
                ctiw.h(sQLiteDatabase, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INTEGER NOT NULL,last_deleted_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", b);
                ctiw.h(sQLiteDatabase, "contacts", "CREATE TABLE IF NOT EXISTS contacts (id INTEGER PRIMARY KEY AUTOINCREMENT,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,contact_properties BLOB NOT NULL,lighter_id_normalized_id TEXT)", ctlu.a);
                ctiw.h(sQLiteDatabase, "participants", "CREATE TABLE IF NOT EXISTS participants (id INTEGER PRIMARY KEY,conversation_row_id INTEGER,contact_row_id INTEGER, UNIQUE(conversation_row_id , contact_row_id) ON CONFLICT REPLACE, FOREIGN KEY(conversation_row_id) REFERENCES conversations(id) ON DELETE CASCADE, FOREIGN KEY(contact_row_id) REFERENCES contacts(id) ON DELETE CASCADE)", ctmc.a);
                ctiw.h(sQLiteDatabase, "blocks", "CREATE TABLE IF NOT EXISTS blocks(id INTEGER PRIMARY KEY,lighter_id_type TEXT,lighter_id_id TEXT,lighter_handler_id TEXT,lighter_id_app_name TEXT,lighter_id_normalized_id TEXT)", ctls.a);
                ctiw.h(sQLiteDatabase, "notifications", "CREATE TABLE notifications (id INTEGER PRIMARY KEY,notification_id TEXT UNIQUE NOT NULL,notification_type INTEGER NOT NULL,notification_metadata BLOB NOT NULL,notification_properties BLOB NOT NULL,notification_timestamp_received_ms INTEGER NOT NULL default 0)", ctmb.a);
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID on blocks(lighter_id_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS blocks_LIGHTER_ID_NORMALIZED on blocks(lighter_id_normalized_id,lighter_id_type,lighter_handler_id,lighter_id_app_name)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS messagesRENDERING_TYPE on messages(rendering_type)");
            } else if (i == 20) {
                ctiw.h(sQLiteDatabase, "conversations", "CREATE TABLE conversations (id INTEGER PRIMARY KEY AUTOINCREMENT,conversation_type TEXT,conversation_group_id TEXT,conversation_group_app_name TEXT,other_contact_row_id TEXT,conversation_app_data BLOB NOT NULL DEFAULT 0,conversation_properties BLOB NOT NULL,update_timestamp_us INT NOT NULL DEFAULT 0, owner_row_id INT, FOREIGN KEY (owner_row_id) REFERENCES contacts(id) ON DELETE CASCADE )", b);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x050c A[Catch: Exception -> 0x0670, TryCatch #26 {Exception -> 0x0670, blocks: (B:13:0x0067, B:14:0x0093, B:16:0x0099, B:18:0x00d1, B:20:0x0111, B:22:0x0123, B:23:0x0131, B:25:0x0137, B:27:0x0147, B:29:0x0159, B:31:0x017e, B:33:0x018b, B:32:0x0187, B:36:0x01bc, B:38:0x01c2, B:40:0x01c7, B:42:0x01cd, B:49:0x01e0, B:51:0x01e6, B:52:0x01eb, B:104:0x0327, B:115:0x0339, B:117:0x0349, B:118:0x0355, B:119:0x0361, B:120:0x0387, B:121:0x0393, B:130:0x0407, B:141:0x0419, B:143:0x042b, B:165:0x04a9, B:166:0x04ac, B:185:0x050c, B:186:0x0511, B:202:0x05b0, B:203:0x05b3, B:223:0x0638, B:243:0x0658, B:246:0x0674, B:248:0x0684, B:53:0x020d, B:55:0x0213, B:57:0x0227, B:61:0x023c, B:63:0x024a, B:67:0x0257, B:69:0x025d, B:70:0x026b, B:71:0x0276, B:72:0x0286, B:73:0x0289, B:75:0x029a, B:76:0x029f, B:78:0x02e0, B:101:0x031e, B:82:0x02e8, B:100:0x031d, B:84:0x02ea, B:86:0x02f4, B:87:0x02fa, B:88:0x02fb, B:90:0x02fd, B:92:0x0307, B:93:0x030d, B:94:0x030e, B:95:0x0317, B:66:0x0253, B:204:0x05d5, B:206:0x05db, B:210:0x0601, B:211:0x060d, B:213:0x061c, B:215:0x061f, B:219:0x062f, B:209:0x05f7, B:168:0x04bc, B:170:0x04c2, B:172:0x04e3, B:173:0x04e7, B:187:0x054e, B:191:0x0559, B:195:0x057c, B:196:0x0588, B:198:0x05a6, B:194:0x0572, B:122:0x03c4, B:124:0x03ca, B:125:0x03dc, B:127:0x0401, B:145:0x0453, B:148:0x045a, B:150:0x047b, B:151:0x047f), top: B:261:0x0067 }] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctgb.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
