package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.filament.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: clib  reason: default package */
/* loaded from: classes5.dex */
final class clib extends SQLiteOpenHelper {
    static final int a = 4;
    public static final /* synthetic */ int b = 0;
    private static final clia e;
    private static final clia f;
    private static final clia g;
    private static final clia h;
    private static final List<clia> i;
    private final int c;
    private boolean d;

    static {
        clia cliaVar = clhw.a;
        e = cliaVar;
        clia cliaVar2 = clhx.a;
        f = cliaVar2;
        clia cliaVar3 = clhy.a;
        g = cliaVar3;
        clia cliaVar4 = clhz.a;
        h = cliaVar4;
        i = Arrays.asList(cliaVar, cliaVar2, cliaVar3, cliaVar4);
    }

    public clib(Context context, int i2) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i2);
        this.d = false;
        this.c = i2;
    }

    private final void a(SQLiteDatabase sQLiteDatabase) {
        if (!this.d) {
            onConfigure(sQLiteDatabase);
        }
    }

    private static final void b(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<clia> list = i;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                i.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        int size = list.size();
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowFixedWidthMajor);
        sb.append("Migration from ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(size);
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.d = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
        b(sQLiteDatabase, 0, this.c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        a(sQLiteDatabase);
        b(sQLiteDatabase, i2, i3);
    }
}
