// automatically generated by the FlatBuffers compiler, do not modify

package vn.com.vng.gsmobile.casino.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class CMDJoinGame extends Table {
  public static CMDJoinGame getRootAsCMDJoinGame(ByteBuffer _bb) { return getRootAsCMDJoinGame(_bb, new CMDJoinGame()); }
  public static CMDJoinGame getRootAsCMDJoinGame(ByteBuffer _bb, CMDJoinGame obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public CMDJoinGame __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public long uid() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public boolean mutateUid(long uid) { int o = __offset(4); if (o != 0) { bb.putLong(o + bb_pos, uid); return true; } else { return false; } }
  public long roomId() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public boolean mutateRoomId(long room_id) { int o = __offset(6); if (o != 0) { bb.putLong(o + bb_pos, room_id); return true; } else { return false; } }
  public int joinType() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateJoinType(int join_type) { int o = __offset(8); if (o != 0) { bb.put(o + bb_pos, (byte)join_type); return true; } else { return false; } }
  public String reqToken() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer reqTokenAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public String password() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer passwordAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }

  public static int createCMDJoinGame(FlatBufferBuilder builder,
      long uid,
      long room_id,
      int join_type,
      int req_tokenOffset,
      int passwordOffset) {
    builder.startObject(5);
    CMDJoinGame.addRoomId(builder, room_id);
    CMDJoinGame.addUid(builder, uid);
    CMDJoinGame.addPassword(builder, passwordOffset);
    CMDJoinGame.addReqToken(builder, req_tokenOffset);
    CMDJoinGame.addJoinType(builder, join_type);
    return CMDJoinGame.endCMDJoinGame(builder);
  }

  public static void startCMDJoinGame(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addUid(FlatBufferBuilder builder, long uid) { builder.addLong(0, uid, 0); }
  public static void addRoomId(FlatBufferBuilder builder, long roomId) { builder.addLong(1, roomId, 0); }
  public static void addJoinType(FlatBufferBuilder builder, int joinType) { builder.addByte(2, (byte)joinType, 0); }
  public static void addReqToken(FlatBufferBuilder builder, int reqTokenOffset) { builder.addOffset(3, reqTokenOffset, 0); }
  public static void addPassword(FlatBufferBuilder builder, int passwordOffset) { builder.addOffset(4, passwordOffset, 0); }
  public static int endCMDJoinGame(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

