package com.teslamotors.plugins.client.d;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
/* compiled from: ContactsHelper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5321a = "a";

    public static boolean a(Context context) {
        return com.teslamotors.plugins.client.e.a(context).c("android.permission.READ_CONTACTS");
    }

    public static void a(final Context context, final List<String> list, final com.teslamotors.plugins.client.a.a aVar) {
        new AsyncTask() { // from class: com.teslamotors.plugins.client.d.a.1
            /* JADX WARN: Can't wrap try/catch for region: R(22:1|2|3|(5:7|(12:44|45|(1:47)|48|49|50|(1:52)(1:70)|53|(6:56|(1:60)|61|(2:63|64)(1:66)|65|54)|67|68|69)|(9:10|(1:12)|13|14|(1:16)(1:37)|17|(6:20|(1:24)|25|(2:27|28)(1:30)|29|18)|31|32)|41|42)|71|(1:73)|(1:75)|76|78|79|(1:81)(1:100)|(1:83)(1:99)|84|(5:87|(1:89)|(2:91|92)(1:94)|93|85)|95|96|97|(0)|(0)|41|42|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x01d4, code lost:
                r3 = r0;
                r5 = r10;
             */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0149 A[Catch: Exception -> 0x0142, TRY_ENTER, TryCatch #3 {Exception -> 0x0142, blocks: (B:32:0x00b5, B:34:0x00c8, B:35:0x00cd, B:59:0x0149, B:61:0x015c, B:62:0x0161), top: B:93:0x00b5 }] */
            /* JADX WARN: Removed duplicated region for block: B:93:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.os.AsyncTask
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected java.lang.Object doInBackground(java.lang.Object[] r20) {
                /*
                    Method dump skipped, instructions count: 502
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.client.d.a.AnonymousClass1.doInBackground(java.lang.Object[]):java.lang.Object");
            }
        }.execute(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, Object> b(String str, HashMap<String, HashMap<String, Object>> hashMap) {
        HashMap<String, Object> hashMap2 = hashMap.get(str);
        return hashMap2 == null ? new HashMap<>() : hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception e) {
            Log.e(f5321a, "Failed to close cursor", e);
        }
    }
}
