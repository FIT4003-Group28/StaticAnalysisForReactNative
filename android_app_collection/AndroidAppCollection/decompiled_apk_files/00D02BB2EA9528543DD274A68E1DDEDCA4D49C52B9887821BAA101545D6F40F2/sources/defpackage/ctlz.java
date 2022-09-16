package defpackage;
/* compiled from: PG */
/* renamed from: ctlz  reason: default package */
/* loaded from: classes5.dex */
public final class ctlz {
    public static final String[] a = {"id", "message_id", "message_type", "sender_contact_row_id", "conversation_row_id", "server_timestamp_us", "message_properties", "message_status", "needs_delivery_receipt", "capability", "rendering_type", "filterable_flags"};
    public static final String b;

    static {
        int i = cugt.DEFAULT_RENDERING_TYPE.h;
        StringBuilder sb = new StringBuilder(630);
        sb.append("CREATE TABLE messages (id INTEGER PRIMARY KEY,message_id TEXT UNIQUE NOT NULL,message_type INTEGER NOT NULL,sender_contact_row_id INTEGER NOT NULL,conversation_row_id INTEGER NOT NULL,server_timestamp_us INTEGER NOT NULL,message_properties BLOB NOT NULL,message_status INTEGER NOT NULL,capability INTEGER NOT NULL default -1,rendering_type INTEGER NOT NULL default ");
        sb.append(i);
        sb.append(",");
        sb.append("needs_delivery_receipt");
        sb.append(" INTEGER NOT NULL default 0,");
        sb.append("filterable_flags");
        sb.append(" INTEGER NOT NULL default 0, FOREIGN KEY(");
        sb.append("sender_contact_row_id");
        sb.append(") REFERENCES ");
        sb.append("contacts");
        sb.append("(");
        sb.append("id");
        sb.append(") ON DELETE CASCADE, FOREIGN KEY(");
        sb.append("conversation_row_id");
        sb.append(") REFERENCES ");
        sb.append("conversations");
        sb.append("(");
        sb.append("id");
        sb.append(") ON DELETE CASCADE)");
        b = sb.toString();
    }
}
