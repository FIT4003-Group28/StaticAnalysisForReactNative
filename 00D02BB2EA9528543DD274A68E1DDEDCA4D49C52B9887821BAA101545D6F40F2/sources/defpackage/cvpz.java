package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: cvpz  reason: default package */
/* loaded from: classes5.dex */
public final class cvpz implements cvos {
    private final cvtz a;
    private final cvqc b;
    private final cvlr c;

    public cvpz(cvtz cvtzVar, cvqc cvqcVar, cvlr cvlrVar) {
        this.a = cvtzVar;
        this.b = cvqcVar;
        this.c = cvlrVar;
    }

    @Override // defpackage.cvos
    public final void a(cvlm cvlmVar) {
        SQLiteDatabase writableDatabase;
        if (cvlmVar.f() == null) {
            cvlw.d("UserFeedbackEventHandler", "NotificationEvent has no intent", new Object[0]);
        } else if (cvlmVar.d().isEmpty()) {
            cvlw.d("UserFeedbackEventHandler", "NotificationEvent has no threads", new Object[0]);
        } else {
            cvkj cvkjVar = cvlmVar.d().get(0);
            cvlp a = this.c.a(drwv.ACTION_CLICK);
            a.b(cvlmVar.b());
            a.r(3);
            a.i(cvlmVar.c());
            a.d(cvkjVar);
            a.s(2);
            a.a();
            cvqc cvqcVar = this.b;
            cvkc c = cvlmVar.c();
            String a2 = cvkjVar.a();
            int intExtra = cvlmVar.f().getIntExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", -1);
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    writableDatabase = cvqcVar.a(c).getWritableDatabase();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (RuntimeException unused) {
            }
            try {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("thread_id", a2);
                contentValues.put("view_index", Integer.valueOf(intExtra));
                writableDatabase.insertWithOnConflict("thread_surveys", null, contentValues, 5);
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                this.a.d(cvlmVar.c(), cvkjVar.a(), cvix.d(), cvkjVar.h());
            } catch (RuntimeException unused2) {
                sQLiteDatabase = writableDatabase;
                cvlw.e("ChimeThreadSurveyStorageImpl", "Error inserting survey state %s %s for account %s %s %s", "view_index", Integer.valueOf(intExtra), c, "thread_id", a2);
                if (sQLiteDatabase == null) {
                    return;
                }
                sQLiteDatabase.close();
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
    }
}
