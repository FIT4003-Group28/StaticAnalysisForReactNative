package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: akgp  reason: default package */
/* loaded from: classes.dex */
public final class akgp {
    public final SQLiteOpenHelper a;
    public final String[] b = {"0 AS suggest_format", "display1 AS suggest_text_1", "display2 AS suggest_text_2", "query AS suggest_intent_query", "_id"};

    public akgp(Context context) {
        this.a = new akgo(context);
    }
}
